package tech.ketc.dagger2naacsample

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import tech.ketc.dagger2naacsample.di.DaggerAppComponent


class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}