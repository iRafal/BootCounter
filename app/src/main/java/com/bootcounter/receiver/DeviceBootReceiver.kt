package com.bootcounter.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.bootcounter.app.DeviceBootApplication
import com.bootcounter.domain.deviceBoot.DeviceBootInteractor

class DeviceBootReceiver: BroadcastReceiver() {

    private val deviceBootInteractor: DeviceBootInteractor =
        DeviceBootApplication.getInstance().appDi.deviceBootInteractor

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d(tag, "Device booted");
    }

    companion object {
        val tag: String = DeviceBootReceiver::class.java.simpleName
    }
}