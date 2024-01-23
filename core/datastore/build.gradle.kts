plugins {
    id("giter.android.library")
}

android {
    namespace = "com.comp.giter.core.datastore"
}

dependencies {
    testImplementation(libs.junit4)
    testImplementation(libs.kotlin.test)
    implementation(libs.androidx.datastore)
}