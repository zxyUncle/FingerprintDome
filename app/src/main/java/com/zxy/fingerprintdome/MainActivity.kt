package com.zxy.fingerprintdome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zxy.zxyfingerprint.BiometricPromptManager
import com.zxy.zxyfingerprint.FingerprintUtils
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by zxy on 2020/9/3 9:57
 * ******************************************
 * * 指纹识别
 * ******************************************
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnVerify.setOnClickListener {
            verify()
        }
    }

    private fun verify() {
        FingerprintUtils.instance()
            .init(this, object : BiometricPromptManager.OnBiometricIdentifyCallback {
                override fun onUsePassword() {
                }

                override fun onSucceeded() {
                }

                override fun onFailed() {
                }

                override fun onError(code: Int, reason: String?) {
                }

                override fun onCancel() {
                }

            })
    }
}