plugins {
    id("giter.android.feature")
}

android {
    namespace = "com.comp.giter.feature.home"
}

dependencies {
    implementation(libs.kotlinx.immutable)
    implementation(libs.compose.shimmer)
}