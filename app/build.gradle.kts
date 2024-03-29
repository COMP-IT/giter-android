plugins {
    id("giter.android.application")
    id("com.google.android.gms.oss-licenses-plugin")
}

android {
    namespace = "com.comp.giter"

    defaultConfig {
        applicationId = "com.comp.giter"
        versionCode = 1
        versionName = "1.0"
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

dependencies {
    implementation(projects.core.navigation)
    implementation(projects.feature.main)
    implementation(projects.feature.home)

    implementation(projects.core.designsystem)
}