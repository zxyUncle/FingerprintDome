package com.zxy.zxyfingerprint

import android.app.Activity
import android.util.Log

/**
 * Created by zxy on 2020/9/3 10:03
 * ******************************************
 * *
 * ******************************************
 */
class FingerprintUtils {
    lateinit var mManager: BiometricPromptManager

    //zxy 单例模式
    private constructor() {}

    companion object {
        @Volatile
        private var instance: FingerprintUtils? = null

        fun instance(): FingerprintUtils {
            if (instance == null) {
                synchronized(FingerprintUtils::class.java) {
                    if (instance == null) {
                        instance = FingerprintUtils()
                    }
                }
            }
            return instance!!
        }
    }

    fun init(mContext: Activity, callback: BiometricPromptManager.OnBiometricIdentifyCallback) {
        mManager = BiometricPromptManager.from(mContext)
        printMessage()
        if (mManager!!.isBiometricPromptEnable) {
            mManager!!.authenticate(callback)
        }
    }

    private fun printMessage() {
        Log.e("", "isHardwareDetected : " + mManager.isHardwareDetected)
        Log.e("", "hasEnrolledFingerprints : " + mManager.hasEnrolledFingerprints())
        Log.e("", "isKeyguardSecure : " + mManager.isKeyguardSecure)
    }

}