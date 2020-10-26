package com.uploadcare.android.widget.viewmodels

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.uploadcare.android.library.api.UploadcareFile
import com.uploadcare.android.library.callbacks.UploadFileCallback
import com.uploadcare.android.library.exceptions.UploadcareApiException
import com.uploadcare.android.library.upload.Uploader
import com.uploadcare.android.library.upload.UrlUploader
import com.uploadcare.android.widget.R
import com.uploadcare.android.widget.controller.UploadcareWidget
import com.uploadcare.android.widget.data.SelectedFile
import com.uploadcare.android.widget.data.SocialSource
import com.uploadcare.android.widget.utils.SingleLiveEvent
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.roundToInt

class UploadcareFilesViewModel(application: Application) : AndroidViewModel(application) {

    val progressDialogCommand = SingleLiveEvent<ProgressData>()
    val closeWidgetCommand = SingleLiveEvent<UploadcareApiException?>()
    val uploadCompleteCommand = SingleLiveEvent<UploadcareFile>()
    val showErrorCommand = SingleLiveEvent<String>()
    val uploadProgress = MutableLiveData<Int>().apply { value = 0 }

    val isRoot = MutableLiveData<Boolean>().apply { value = true }

    private var socialSource: SocialSource? = null
    private var storeUponUpload = false
    private var cancelable : Boolean = false
    private var showProgress : Boolean = false
    private var uploader: Uploader? = null

    fun start(source: SocialSource, store: Boolean, cancelable : Boolean, showProgress : Boolean) {
        this.socialSource = source
        this.storeUponUpload = store
        this.cancelable = cancelable
        this.showProgress = showProgress
    }

    fun selectFile(fileUrl: String) {
        socialSource?.let { source ->
            progressDialogCommand.postValue(ProgressData(true,
                    getContext().getString(R.string.ucw_action_loading_image), cancelable, showProgress))

            UploadcareWidget.getInstance(getContext())
                    .socialApi
                    .selectFile(source.getCookie(getContext()), source.urls.done, fileUrl)
                    .enqueue(object : Callback<SelectedFile> {
                        override fun onFailure(call: Call<SelectedFile>, t: Throwable) {
                            error(UploadcareApiException(t))
                        }

                        override fun onResponse(call: Call<SelectedFile>,
                                                response: Response<SelectedFile>) {
                            response.body()?.let {
                                uploadFileFromUrl(it)
                            } ?: error()
                        }
                    })
        }
    }

    fun saveCookie(cookie: String) {
        socialSource?.let { it.saveCookie(getContext(), cookie) }
    }

    fun signOut() {
        socialSource?.let { source ->
            progressDialogCommand.postValue(ProgressData(true,
                    getContext().getString(R.string.ucw_action_signout)))

            UploadcareWidget.getInstance(getContext())
                    .socialApi
                    .signOut(source.getCookie(getContext()), source.urls.session)
                    .enqueue(object : Callback<Any> {
                        override fun onFailure(call: Call<Any>, t: Throwable) {
                            progressDialogCommand.postValue(ProgressData(false))
                            showErrorCommand.postValue(getContext()
                                    .getString(R.string.ucw_error_auth))
                        }

                        override fun onResponse(call: Call<Any>, response: Response<Any>) {
                            progressDialogCommand.postValue(ProgressData(false))
                            source.deleteCookie(getContext())
                            closeWidgetCommand.postValue(null)
                        }
                    })
        }
    }

    fun canlcelUpload(){
        uploader?.cancel()
        uploader = null
        closeWidgetCommand.postValue(UploadcareApiException("Canceled"))
    }

    private fun uploadFileFromUrl(file: SelectedFile) {
        uploader = UrlUploader(UploadcareWidget
                .getInstance(getContext()).uploadcareClient, file.url)
                .store(storeUponUpload)
        uploader!!.uploadAsync(object : UploadFileCallback {
            override fun onFailure(e: UploadcareApiException) {
                error(e)
            }

            override fun onProgressUpdate(
                    bytesWritten: Long,
                    contentLength: Long,
                    progress: Double) {
                if (showProgress) {
                    uploadProgress.value = (progress * 100).roundToInt()
                }
            }

            override fun onSuccess(result: UploadcareFile) {
                progressDialogCommand.postValue(ProgressData(false))
                uploadCompleteCommand.postValue(result)
                uploader = null
            }

        })
    }

    private fun error(e: UploadcareApiException? = null) {
        progressDialogCommand.postValue(ProgressData(false))
        closeWidgetCommand.postValue(e)
        uploader = null
    }

    private fun getContext(): Context {
        return getApplication()
    }
}