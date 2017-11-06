package tech.ketc.dagger2naacsample.ui.main

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import tech.ketc.dagger2naacsample.R
import tech.ketc.dagger2naacsample.ui.model.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private val model: MainViewModel by lazy { ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model.bitmap.observe(this) {
            it.ifPresent { image.setImageBitmap(it) }
            it.ifError { Toast.makeText(this, "error", Toast.LENGTH_SHORT).show() }
        }
        button.setOnClickListener {
            val url = edit.text.toString()
            model.imageUrl.value = url
        }
    }
}