plugins {
    id("giter.android.library")
    id("giter.android.compose")
}

android {
    namespace = "com.comp.giter.core.designsystem"
}

dependencies {
    implementation(libs.androidx.appcompat)

    implementation(libs.landscapist.bom)
    implementation(libs.landscapist.coil)
    implementation(libs.landscapist.placeholder)
}