plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = 33
    namespace = "com.lagradost.cloudstream3.movieproviders"

    defaultConfig {
        minSdk = 21
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("com.lagradost:cloudstream3:1.0.0")
}
