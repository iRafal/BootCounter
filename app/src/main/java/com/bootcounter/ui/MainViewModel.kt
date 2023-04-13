package com.bootcounter.ui

import androidx.lifecycle.ViewModel
import com.bootcounter.app.DeviceBootApplication
import com.bootcounter.domain.deviceBoot.DeviceBootInteractor
import com.bootcounter.ui.ScreenState.Companion.initialState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MainViewModel : ViewModel() {

    private val deviceBootInteractor: DeviceBootInteractor =
        DeviceBootApplication.getInstance().appDi.deviceBootInteractor

    private val _screenData = MutableStateFlow(initialState)
    val screenState: StateFlow<ScreenState> = _screenData
}

data class ScreenState(
    val title: String = ""
) {
    companion object {
        val initialState = ScreenState("")
    }
}