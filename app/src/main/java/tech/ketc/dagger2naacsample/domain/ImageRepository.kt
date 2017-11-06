package tech.ketc.dagger2naacsample.domain

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL


class ImageRepository : IImageRepository {
    override fun getImage(urlStr: String): Bitmap {
        Log.v(javaClass.name, "getImage()")
        var connection: HttpURLConnection? = null
        var inputStream: InputStream? = null
        try {
            val url = URL(urlStr)
            connection = url.openConnection()!! as HttpURLConnection
            connection.allowUserInteraction = false
            connection.instanceFollowRedirects = false
            connection.requestMethod = "GET"
            connection.connect()
            val responseCode = connection.responseCode
            if (responseCode == HttpURLConnection.HTTP_OK) {
                inputStream = connection.inputStream
                Thread.sleep(3000)
                Log.v(javaClass.name, "complete")
                return BitmapFactory.decodeStream(inputStream)
            } else {
                throw  RuntimeException("failed load image : responseCode = $responseCode")
            }
        } finally {
            inputStream?.close()
            connection?.disconnect()
        }
    }
}