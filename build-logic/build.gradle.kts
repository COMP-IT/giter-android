plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    implementation(libs.verify.detektPlugin)
}

gradlePlugin {
    plugins {
        register("androidHilt") {
            id = "giter.android.hilt"
            implementationClass = "com.comp.giter.HiltAndroidPlugin"
        }
        register("kotlinHilt") {
            id = "giter.kotlin.hilt"
            implementationClass = "com.comp.giter.HiltKotlinPlugin"
        }
    }
}
