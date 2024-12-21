// app/build.gradle.kts
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}
apply(plugin = "com.google.gms.google-services")

android {
    namespace = "com.example.baitapnhomlaptrinhadr_nhd_cosmetic"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.baitapnhomlaptrinhadr_nhd_cosmetic"
        minSdk = 26
        targetSdk = 34 // Đảm bảo tương thích với Android 14
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Firebase
    implementation("com.google.firebase:firebase-auth:23.1.0") // RecyclerView
        implementation ("androidx.recyclerview:recyclerview:1.2.1")

<<<<<<< HEAD
        // Volley (cho phép gửi yêu cầu HTTP tới API)
        implementation ("com.android.volley:volley:1.2.1")

        // Gson (Xử lý JSON)
        implementation ("com.google.code.gson:gson:2.8.8")

        // Các thư viện khác của Android
        implementation ("androidx.appcompat:appcompat:1.6.1")
        implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

        // Thư viện khác nếu cần
        // implementation 'com.squareup.picasso:picasso:2.71828' // Nếu bạn muốn sử dụng thư viện Picasso để tải ảnh từ URL
=======
>>>>>>> 10ed0db8108920e810b42f965f0b49d2cb1a2f8f

    // Android UI libraries
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.3.1")
    implementation ("com.github.bumptech.glide:glide:4.15.1")
<<<<<<< HEAD
=======
    implementation(libs.volley)
>>>>>>> 10ed0db8108920e810b42f965f0b49d2cb1a2f8f
    annotationProcessor ("com.github.bumptech.glide:compiler:4.15.1")

    // Image Loading
    implementation("com.squareup.picasso:picasso:2.8")
    implementation("com.github.bumptech.glide:glide:4.13.2")
    annotationProcessor("com.github.bumptech.glide:compiler:4.13.2")

    // Retrofit & Gson
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:adapter-rxjava3:2.9.0")

    // RxJava
    implementation("io.reactivex.rxjava3:rxjava:3.0.13")
    implementation("io.reactivex.rxjava3:rxandroid:3.0.0")
    implementation("com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0")

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")

    // Kotlin Standard Libraries
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.10")

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
