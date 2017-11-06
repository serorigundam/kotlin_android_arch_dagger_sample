package tech.ketc.dagger2naacsample.ui.main

import dagger.android.AndroidInjector
import dagger.Subcomponent


@Subcomponent
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}