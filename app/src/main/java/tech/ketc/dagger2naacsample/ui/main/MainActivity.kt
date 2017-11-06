package tech.ketc.dagger2naacsample.ui.main

import android.arch.lifecycle.ViewModelProvider
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import tech.ketc.dagger2naacsample.R
import tech.ketc.dagger2naacsample.ui.model.MainViewModel
import tech.ketc.dagger2naacsample.util.arch.viewmodel.viewModel
import tech.ketc.dagger2naacsample.util.di.AutoInject
import javax.inject.Inject

class MainActivity : AppCompatActivity(), AutoInject {
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private val model: MainViewModel by viewModel { viewModelFactory }
    override fun onCreate(savedInstanceState: Bundle?) {
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