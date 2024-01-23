plugins {
    id("giter.android.library")
    id("giter.android.hilt")
    id("kotlinx-serialization")
}

android {
    namespace = "com.comp.giter.core.data"
}

dependencies {
     implementation(projects.core.model)
     implementation(projects.core.datastore)

    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
    implementation(libs.okhttp.logging)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.datetime)
    testImplementation(libs.turbine)
}