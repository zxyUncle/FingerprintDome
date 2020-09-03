# 指纹

[![](https://jitpack.io/v/zxyUncle/FingerprintDome.svg)](https://jitpack.io/#zxyUncle/FingerprintDome)
Gradle
-----
Step 1


     allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	dependencies {
	  implementation 'com.github.zxyUncle:FingerprintDome:1.0.0'
	}
使用：

     FingerprintUtils.instance().init(this, object : BiometricPromptManager.OnBiometricIdentifyCallback {
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

效果图：
![Image text](https://github.com/zxyUncle/FingerprintDome/blob/master/aa.jpg)

