import com.comp.giter.configureHiltAndroid
import com.comp.giter.configureKotestAndroid
import com.comp.giter.configureKotlinAndroid

plugins {
    id("com.android.application")
}

configureKotlinAndroid()
configureHiltAndroid()
configureKotestAndroid()