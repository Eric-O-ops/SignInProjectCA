
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    // Kapt
    id ("kotlin-kapt")
    // Hilt
    id ("dagger.hilt.android.plugin")
}

android {
    namespace = "com.eric.signinprojectca"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.eric.signinprojectca"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        jvmTarget = "1.8"
    }

    buildFeatures.viewBinding = true

}

dependencies {

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("com.google.android.material:material:1.7.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // ViewBinding Property Delegate
    val view_binding_property_delegate = "1.4.7"
    implementation("com.github.kirich1409:viewbindingpropertydelegate-noreflection:$view_binding_property_delegate")

    // Navigation
    val nav_version = "2.5.2"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")

    //kotlin_activity
    val activity_version = "1.3.0"
    implementation("androidx.activity:activity-ktx:$activity_version")

    //kotlin_fragment
    val fragment_version = "1.3.6"
    implementation("androidx.fragment:fragment-ktx:$fragment_version")

    //Hilt
    val hilt_version = "2.42"
    implementation("com.google.dagger:hilt-android:$hilt_version")
    kapt("com.google.dagger:hilt-android-compiler:$hilt_version")

}