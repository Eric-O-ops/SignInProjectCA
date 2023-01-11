plugins {
    id(Plugins.javaLibrary)
    id(Plugins.kotlinJVM)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {

    // Coroutines
    api(Dependencies.Coroutines.coroutinesAndroid)
    api(Dependencies.Coroutines.coroutinesCore)

    //Inject
    api(Dependencies.Inject.inject)
}