package tech.ketc.dagger2naacsample

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import tech.ketc.dagger2naacsample.di.DaggerAppComponent
import tech.ketc.dagger2naacsample.util.di.applyAutoInject


class App : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        applyAutoInject()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}