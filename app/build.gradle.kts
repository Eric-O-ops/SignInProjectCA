
plugins {
    id(Plugins.application)
    id(Plugins.kotlinAndroid)

    // Kapt
    kotlin(Plugins.kapt)
    // Hilt
    id (Plugins.hilt)
}

android {
    namespace = Config.applicationId
    compileSdk = Config.compileAndTargetSdk

    defaultConfig {
        applicationId = Config.applicationId
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

    // Appcompat
    implementation(Dependencies.UIComponents.appcompat)

    // Material
    implementation(Dependencies.UIComponents.material)

    // Constraint layout
    implementation(Dependencies.UIComponents.constraintLayout)

    // ViewBinding Property Delegate
    implementation(Dependencies.ViewBindingPropertyDelegate.viewBindingDelegate)

    // Navigation
    implementation(Dependencies.Navigation.navigation)

    //Hilt
    implementation(Dependencies.DaggerHilt.daggerHilt)
    kapt(Dependencies.DaggerHilt.hiltAndroidKapt)

    // Coroutines
    implementation(Dependencies.Coroutines.coroutinesAndroid)
    implementation (Dependencies.Coroutines.coroutinesCore)

    // Retrofit 2
    implementation(Dependencies.Retrofit2.retrofit)
    implementation(Dependencies.Retrofit2.gsonConverter)

    // Kotlin_activity
    implementation(Dependencies.KotlinActivity.activityKtx)

    // Kotlin_fragment
    implementation(Dependencies.KotlinFragment.fragmentKtx)

    // OkHttp
    implementation(Dependencies.OkHttp.okhttpBom)
    implementation(Dependencies.OkHttp.okhttp)
    implementation(Dependencies.OkHttp.loggingInterceptor)

}