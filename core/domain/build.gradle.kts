plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "team.ppac.domain"
    compileSdk = libs.versions.compileSdk.get().toInt()
}

dependencies {
    implementation(project(":core:common:kotlin"))
    implementation(project(":core:navigator"))

    implementation(libs.javax.inject)
    implementation(libs.kotlin.coroutines.core)
    implementation(libs.kotlin.coroutines.android)
}