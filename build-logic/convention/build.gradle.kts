plugins {
    `kotlin-dsl`
}

group = "com.isanghoony.conventionplugin"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "convention.plugin.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}
