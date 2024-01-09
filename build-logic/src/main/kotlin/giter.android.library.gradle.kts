import com.comp.giter.configureCoroutineAndroid
import com.comp.giter.configureHiltAndroid
import com.comp.giter.configureKotest
import com.comp.giter.configureKotlinAndroid

plugins {
    id("com.android.library")
    id("giter.verify.detekt")
}

configureKotlinAndroid()
configureKotest()
configureCoroutineAndroid()
configureHiltAndroid()
