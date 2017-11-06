package tech.ketc.dagger2naacsample.di

import tech.ketc.dagger2naacsample.ui.model.di.ViewModelComponent
import android.arch.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import tech.ketc.dagger2naacsample.ui.main.MainActivityComponent
import tech.ketc.dagger2naacsample.ui.model.factory.ViewModelFactory
import javax.inject.Singleton


@Module(subcomponents = arrayOf(MainActivityComponent::class))
class AppModule {

    @Singleton
    @Provides
    fun provideViewModelFactory(builder: ViewModelComponent.Builder): ViewModelProvider.Factory = ViewModelFactory(builder.build())
}