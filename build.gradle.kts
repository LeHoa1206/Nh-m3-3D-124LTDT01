plugins {
    alias(libs.plugins.android.application) apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Thêm classpath để sử dụng Google Services plugin
    }
}