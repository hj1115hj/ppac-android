plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "team.ppac.common.android"
    compileSdk = libs.versions.compileSdk.get().toInt()
}

dependencies {
    implementation(project(":core:designsystem"))

    implementation(libs.kotlin.coroutines.android)
    implementation(libs.kotlin.coroutines.core)
    implementation(libs.bundles.lifecycle)
    implementation(libs.bundles.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.timber)
}