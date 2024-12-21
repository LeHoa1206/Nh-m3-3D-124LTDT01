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
<<<<<<< HEAD
        classpath("com.google.gms:google-services:4.4.2")
=======
>>>>>>> 1646bbd20e3ada237d73e89154f62f3539f320f9
    }
}