package tech.ketc.dagger2naacsample.util.arch.viewmodel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity

inline fun <reified T : ViewModel> AppCompatActivity.viewModel(crossinline provider: () -> ViewModelProvider.Factory)
        = lazy { ViewModelProviders.of(this, provider()).get(T::class.java) }
