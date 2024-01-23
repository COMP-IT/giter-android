plugins {
    id("giter.android.library")
}

android {
    namespace = "com.comp.giter.core.domain"
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.core.model)

    implementation(libs.inject)
}