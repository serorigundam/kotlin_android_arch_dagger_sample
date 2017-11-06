package tech.ketc.dagger2naacsample.di

import dagger.Component
import tech.ketc.dagger2naacsample.App
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import tech.ketc.dagger2naacsample.domain.di.RepositoryModule
import tech.ketc.dagger2naacsample.ui.di.ActivityModule
import tech.ketc.dagger2naacsample.ui.model.factory.ModelFactoryModule
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(AndroidSupportInjectionModule::class, ActivityModule::class, ModelFactoryModule::class, RepositoryModule::class))
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}