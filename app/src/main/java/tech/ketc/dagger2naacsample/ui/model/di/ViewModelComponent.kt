package tech.ketc.dagger2naacsample.ui.model.di

import dagger.Subcomponent
import tech.ketc.dagger2naacsample.ui.model.MainViewModel


@Subcomponent
interface ViewModelComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): ViewModelComponent
    }

    fun mainViewModel(): MainViewModel
}