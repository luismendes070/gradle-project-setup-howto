pluginManagement {
    // Get community plugins from the Gradle Plugin Portal
    repositories.gradlePluginPortal()
    // And Android plugins from Google
    repositories.google()

    // Get our own convention plugins from 'gradle/plugins'
    if (File(rootDir, "gradle/plugins").exists()) {
        includeBuild("gradle/plugins")
    }
    // If not the main build, 'plugins' is located next to the build (e.g. gradle/settings)
    if (File(rootDir, "../plugins").exists()) {
        includeBuild("../plugins")
    }
}

dependencyResolutionManagement {
    // Get components from Maven Central
    repositories.mavenCentral()
    // And Android components from Google
    repositories.google()
    // In the main build, find the platform in 'gradle/platform'
    if (File(rootDir, "gradle/platform").exists()) {
        includeBuild("gradle/platform")
    }
}
