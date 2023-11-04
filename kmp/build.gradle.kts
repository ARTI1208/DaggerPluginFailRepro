plugins {
    id("convention.kmp")
    id("convention.dagger")
}

@OptIn(org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi::class)
kotlin {

    sourceSets {
        val androidMain by getting {
            dependencies {
                implementation("androidx.core:core-ktx:1.9.0")
                implementation("androidx.appcompat:appcompat:1.6.1")
            }
        }
        val commonMain by getting {
            dependencies {
                //put your multiplatform dependencies here
            }
        }
        val commonTest by getting {
            dependencies {
//                implementation(libs.kotlin.test)
            }
        }
    }
}

android {
    namespace = "com.example.kmp"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}
