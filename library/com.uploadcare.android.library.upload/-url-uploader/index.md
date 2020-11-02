---
title: UrlUploader -
---
//[library](../../index.md)/[com.uploadcare.android.library.upload](../index.md)/[UrlUploader](index.md)



# UrlUploader  
 [androidJvm] class [UrlUploader](index.md)(**client**: [UploadcareClient](../../com.uploadcare.android.library.api/-uploadcare-client/index.md), **sourceUrl**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [Uploader](../-uploader/index.md)

Uploadcare uploader for URLs.

   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| <a name="com.uploadcare.android.library.upload/UrlUploader/UrlUploader/#com.uploadcare.android.library.api.UploadcareClient#kotlin.String/PointingToDeclaration/"></a>[UrlUploader](-url-uploader.md)| <a name="com.uploadcare.android.library.upload/UrlUploader/UrlUploader/#com.uploadcare.android.library.api.UploadcareClient#kotlin.String/PointingToDeclaration/"></a> [androidJvm] fun [UrlUploader](-url-uploader.md)(client: [UploadcareClient](../../com.uploadcare.android.library.api/-uploadcare-client/index.md), sourceUrl: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))   <br>


## Types  
  
|  Name|  Summary| 
|---|---|
| <a name="com.uploadcare.android.library.upload/UrlUploader.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.uploadcare.android.library.upload/UrlUploader.Companion///PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| <a name="com.uploadcare.android.library.upload/UrlUploader/cancel/#/PointingToDeclaration/"></a>[cancel](cancel.md)| <a name="com.uploadcare.android.library.upload/UrlUploader/cancel/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [cancel](cancel.md)()  <br>More info  <br>Cancel upload of the file.  <br><br><br>
| <a name="com.uploadcare.android.library.upload/UrlUploader/checkDuplicates/#kotlin.Boolean/PointingToDeclaration/"></a>[checkDuplicates](check-duplicates.md)| <a name="com.uploadcare.android.library.upload/UrlUploader/checkDuplicates/#kotlin.Boolean/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [checkDuplicates](check-duplicates.md)(checkDuplicates: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [UrlUploader](index.md)  <br>More info  <br>Set to run duplicates check upon file uploading.  <br><br><br>
| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../../com.uploadcare.android.library.utils/-moshi-adapter/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F2103969333)| <a name="kotlin/Any/equals/#kotlin.Any?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open operator fun [equals](../../com.uploadcare.android.library.utils/-moshi-adapter/index.md#%5Bkotlin%2FAny%2Fequals%2F%23kotlin.Any%3F%2FPointingToDeclaration%2F%5D%2FFunctions%2F2103969333)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[hashCode](../../com.uploadcare.android.library.utils/-moshi-adapter/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2103969333)| <a name="kotlin/Any/hashCode/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [hashCode](../../com.uploadcare.android.library.utils/-moshi-adapter/index.md#%5Bkotlin%2FAny%2FhashCode%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2103969333)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| <a name="com.uploadcare.android.library.upload/UrlUploader/saveDuplicates/#kotlin.Boolean/PointingToDeclaration/"></a>[saveDuplicates](save-duplicates.md)| <a name="com.uploadcare.android.library.upload/UrlUploader/saveDuplicates/#kotlin.Boolean/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [saveDuplicates](save-duplicates.md)(saveDuplicates: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [UrlUploader](index.md)  <br>More info  <br>Save duplicates upon file uploading.  <br><br><br>[androidJvm]  <br>Content  <br>fun [saveDuplicates](save-duplicates.md)(filename: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [UrlUploader](index.md)  <br>More info  <br>Sets the name for a file uploaded from URL.  <br><br><br>
| <a name="com.uploadcare.android.library.upload/UrlUploader/signedUpload/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[signedUpload](signed-upload.md)| <a name="com.uploadcare.android.library.upload/UrlUploader/signedUpload/#kotlin.String#kotlin.String/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>fun [signedUpload](signed-upload.md)(signature: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), expire: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [UrlUploader](index.md)  <br>More info  <br>Signed Upload - let you control who and when can upload files to a specified Uploadcare project.  <br><br><br>
| <a name="com.uploadcare.android.library.upload/UrlUploader/store/#kotlin.Boolean/PointingToDeclaration/"></a>[store](store.md)| <a name="com.uploadcare.android.library.upload/UrlUploader/store/#kotlin.Boolean/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [store](store.md)(store: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [UrlUploader](index.md)  <br>More info  <br>Store the file upon uploading.  <br><br><br>
| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[toString](../../com.uploadcare.android.library.utils/-moshi-adapter/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2103969333)| <a name="kotlin/Any/toString/#/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open fun [toString](../../com.uploadcare.android.library.utils/-moshi-adapter/index.md#%5Bkotlin%2FAny%2FtoString%2F%23%2FPointingToDeclaration%2F%5D%2FFunctions%2F2103969333)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| <a name="com.uploadcare.android.library.upload/UrlUploader/upload/#com.uploadcare.android.library.callbacks.ProgressCallback?/PointingToDeclaration/"></a>[upload](upload.md)| <a name="com.uploadcare.android.library.upload/UrlUploader/upload/#com.uploadcare.android.library.callbacks.ProgressCallback?/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [upload](upload.md)(progressCallback: [ProgressCallback](../../com.uploadcare.android.library.callbacks/-progress-callback/index.md)?): [UploadcareFile](../../com.uploadcare.android.library.api/-uploadcare-file/index.md)  <br>More info  <br>Synchronously uploads the file from provided URL to Uploadcare.  <br><br><br>[androidJvm]  <br>Content  <br>fun [upload](upload.md)(pollingInterval: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html), progressCallback: [ProgressCallback](../../com.uploadcare.android.library.callbacks/-progress-callback/index.md)? = null): [UploadcareFile](../../com.uploadcare.android.library.api/-uploadcare-file/index.md)  <br>More info  <br>Synchronously uploads the file to Uploadcare.  <br><br><br>
| <a name="com.uploadcare.android.library.upload/UrlUploader/uploadAsync/#com.uploadcare.android.library.callbacks.UploadFileCallback/PointingToDeclaration/"></a>[uploadAsync](upload-async.md)| <a name="com.uploadcare.android.library.upload/UrlUploader/uploadAsync/#com.uploadcare.android.library.callbacks.UploadFileCallback/PointingToDeclaration/"></a>[androidJvm]  <br>Content  <br>open override fun [uploadAsync](upload-async.md)(callback: [UploadFileCallback](../../com.uploadcare.android.library.callbacks/-upload-file-callback/index.md))  <br>More info  <br>Asynchronously uploads the file from provided URL to Uploadcare.  <br><br><br>
