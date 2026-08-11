plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.friday.phone"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.friday.phone"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.2"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.15.0")
    implementation("androidx.appcompat:appcompat:1.7.0")
}
