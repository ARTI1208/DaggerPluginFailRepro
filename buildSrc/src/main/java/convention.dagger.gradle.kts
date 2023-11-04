import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinProjectExtension

plugins {
    kotlin("kapt")
    id("com.google.devtools.ksp")
    id("com.google.dagger.hilt.android")
}

dependencies {
    val unifiedImplementation = when (val extension = kotlin as? KotlinMultiplatformExtension) {
        null -> "implementation"
        else -> extension.sourceSets.getByName("androidMain").implementationConfigurationName
    }

    unifiedImplementation("com.google.dagger:hilt-android:2.48.1")
    "kapt"("com.google.dagger:hilt-compiler:2.48.1")
}

val Project.kotlin: KotlinProjectExtension
    get() = extensions.getByName("kotlin") as KotlinProjectExtension