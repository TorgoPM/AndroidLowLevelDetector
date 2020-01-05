package net.imknown.android.forefrontinfo.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GetRawPropEventViewModel : ViewModel() {
    val isGetPropFinish by lazy { MutableLiveData<Nothing>() }

    fun onFinish() {
        isGetPropFinish.value = null
    }
}