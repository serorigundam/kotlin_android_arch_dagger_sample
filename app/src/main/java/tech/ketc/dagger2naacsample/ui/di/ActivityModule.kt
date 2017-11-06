package tech.ketc.dagger2naacsample.ui.di

import android.app.Activity
import dagger.android.AndroidInjector
import tech.ketc.dagger2naacsample.ui.main.MainActivity
import dagger.android.ActivityKey
import dagger.multibindings.IntoMap
import dagger.Binds
import dagger.Module
import tech.ketc.dagger2naacsample.ui.main.MainActivityComponent


@Module
abstract class ActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindInjectorFactory(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>
}