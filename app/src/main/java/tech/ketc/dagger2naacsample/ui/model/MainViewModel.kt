package tech.ketc.dagger2naacsample.ui.model

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import tech.ketc.dagger2naacsample.domain.IImageRepository
import tech.ketc.dagger2naacsample.util.arch.livedata.asyncSwitchMap
import javax.inject.Inject

class MainViewModel @Inject constructor(private val imageRepository: IImageRepository) : ViewModel() {
    val imageUrl = MutableLiveData<String>()
    val bitmap = imageUrl.asyncSwitchMap { imageRepository.getImage(it ?: throw IllegalStateException()) }
}