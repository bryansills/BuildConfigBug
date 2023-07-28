plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.buildconfig)
}

kotlin {
    targetHierarchy.default()

    android {
        publishLibraryVariants("release")
        compilations.all {
            kotlinOptions {
                jvmTarget = "17"
            }
        }
    }
}

android {
    namespace = "buttz.mcghee"

    compileSdk = 34
    defaultConfig {
        minSdk = 17
    }
    compileOptions {
        sourceCompatibility = JavaVersion.toVersion(17)
        targetCompatibility = JavaVersion.toVersion(17)
    }
}

buildConfig {
    buildConfigField("String", "Testing", """"It's a value!"""")
}