pluginManagement {
    includeBuild("gradle/plugins")
    repositories.gradlePluginPortal()
    repositories.google()
}
plugins {
    id("org.example.gradle.report.develocity")
    id("org.example.gradle.feature.repositories")
    id("org.example.gradle.feature.build-cache")
    id("org.example.gradle.feature.project-structure")
}

rootProject.name = "gradle-project-setup-howto"
