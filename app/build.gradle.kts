plugins { id("org.example.gradle.component.application") }

// Complicated notation for 'capabilities' - upvote: https://github.com/gradle/gradle/issues/25629
dependencies {
    implementation(projects.bespin)
    implementation(projects.corellia)
    implementation(projects.kamino)
    implementation(projects.kashyyyk)
    implementation(projects.naboo)
    implementation(projects.tatooine)
    implementation(libs.guice)
    implementation(libs.guice.servlet)
    implementation(libs.kotlin.stdlib)
    implementation(libs.slf4j.api)
    implementation(libs.spring.boot)
    implementation(libs.spring.boot.autoconfigure)
    implementation(libs.spring.context)
    implementation(libs.spring.web)
    runtimeOnly(libs.slf4j.simple)
    runtimeOnly(libs.spring.boot.starter.web)

    mockApiApi(libs.guava)
    mockApiImplementation(projects.app)

    testImplementation(libs.junit.jupiter.api)

    testEndToEndApi(libs.junit.jupiter.api)
    // testEndToEndImplementation(projects.app) { capabilities { requireCapability("${project.group}:$name-mock-api") } }

    // Ensure you have a dependency on the JUnit platform or other test frameworks if required
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.1")

    testEndToEndImplementation(libs.guava)
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

subprojects {
    java {
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17))
        }
    }
}

repositories {
    mavenCentral()
}


