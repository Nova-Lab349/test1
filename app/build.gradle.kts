plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.novatest.myapp"
    //the max api version for android 36 = android 16, 28 = android
    compileSdk = 34

    defaultConfig {
        applicationId = "com.novatest.myapp"
        //the min api version for android 36 = android 16, 28 = android
        minSdk = 28
        //the target version for
        targetSdk = 34
        //the version of the app
        versionCode = 1
        versionName = "0.1.0-alpha"
    }

    //the version of java that compatible
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    //set the java version
    kotlinOptions {
        jvmTarget = "17"
    }
}

//files from repo that are needed
dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
}