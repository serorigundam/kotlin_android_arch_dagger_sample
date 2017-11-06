package tech.ketc.dagger2naacsample.domain

import android.graphics.Bitmap

interface IImageRepository {
    fun getImage(urlStr: String = "http://pbs.twimg.com/media/DNJ6shvUIAI8Ffj.jpg:orig"): Bitmap
}