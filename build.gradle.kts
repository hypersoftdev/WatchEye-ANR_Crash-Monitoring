// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.google.firebase.crashlytics") version "3.0.2" apply false
    alias(libs.plugins.android.library) apply false
}