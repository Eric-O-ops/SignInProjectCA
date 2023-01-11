plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)

    // Kapt
    kotlin(Plugins.kapt)
    // Hilt
    id(Plugins.hilt)
}

android {
    namespace = Config.App.applicationId
    compileSdk = Config.compileAndTargetSdk

    defaultConfig {
        applicationId = Config.App.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.compileAndTargetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Config.jvmTarget
    }

    buildFeatures.viewBinding = true

}

dependencies {

    // Core
    implementation(Dependencies.Core.core)

    //Hilt
    implementation(Dependencies.DaggerHilt.daggerHilt)
    kapt(Dependencies.DaggerHilt.hiltAndroidKapt)

    // Data module
    implementation(project(":data"))

    // Domain module
    implementation(project(":domain"))

    // Presentation module
    implementation(project(":presentation"))
}