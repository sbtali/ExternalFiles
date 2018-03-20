package com.alisabet.externalfiles

import android.os.Environment

class FileUtil {
        companion object {

            //External file direction
            val externalDirection = Environment.getExternalStorageDirectory()
            //External file direction path
            val externalDirectionPath = externalDirection.absolutePath

            /*Public External Storage Directory*/
            //Get public external storage folder ( /storage/emulated/0 ).
            var externalDir = Environment.getExternalStorageDirectory()
            //Get /storage/emulated/0/Music folder.
            var musicPublicDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC)
            //Get /storage/emulated/0/Movies folder.
            var moviesPublicDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES)

            /*App Specific (Private) External Storage Folder*/
            //Return folder /storage/emulated/0/Android/data/com.alisabet.downloadfilefrominternet/files
            var privateDir = context.getExternalFilesDir(null)
            //Return folder /storage/emulated/0/Android/data/com.alisabet.downloadfilefrominternet/files/Music
            var musicPrivateDir = context.getExternalFilesDir(Environment.DIRECTORY_MUSIC)
            //Create and return folder /storage/emulated/0/Android/data/com.alisabet.downloadfilefrominternet/files/Custom
            var customPrivateDir = context.getExternalFilesDir("Custom")
            //Return folder /storage/emulated/0/Android/data/com.alisabet.downloadfilefrominternet/cache
            var cachedPrivateDir = context.getExternalCacheDir()

            /*functions*/
            private fun isExternalStorageAvailable(): Boolean {
                val extStorageState = Environment.getExternalStorageState()
                return Environment.MEDIA_MOUNTED == extStorageState
            }
            private fun isExternalStorageReadOnly(): Boolean {
                val extStorageState = Environment.getExternalStorageState()
                return Environment.MEDIA_MOUNTED_READ_ONLY.equals(extStorageState)
            }

        }
}