package tech.ketc.dagger2naacsample.domain.di

import dagger.Module
import dagger.Provides
import tech.ketc.dagger2naacsample.domain.IImageRepository
import tech.ketc.dagger2naacsample.domain.ImageRepository
import tech.ketc.dagger2naacsample.ui.model.di.ViewModelComponent
import javax.inject.Singleton

@Module(subcomponents = arrayOf(ViewModelComponent::class))
class RepositoryModule {
    @Singleton
    @Provides
    fun provideImageRepository(): IImageRepository {
        return ImageRepository()
    }
}