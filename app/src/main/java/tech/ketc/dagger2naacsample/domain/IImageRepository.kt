package tech.ketc.dagger2naacsample.domain

import android.graphics.Bitmap

interface IImageRepository {
    fun getImage(urlStr: String): Bitmap
}