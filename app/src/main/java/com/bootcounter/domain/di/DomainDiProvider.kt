package com.bootcounter.domain.di

import com.bootcounter.data.deviceBoot.repository.DeviceBootRepository
import com.bootcounter.domain.deviceBoot.DeviceBootInteractor
import com.bootcounter.domain.deviceBoot.DeviceBootInteractorImpl

object DomainDiProvider {
    fun deviceBootInteractor(
        deviceBootRepository: DeviceBootRepository
    ): DeviceBootInteractor = DeviceBootInteractorImpl(deviceBootRepository)
}