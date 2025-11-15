plugins {
    id("java")
    id("idea")
    id("com.github.ben-manes.versions") version "0.52.0"
    id("org.sonarqube") version "7.0.0.6105"
    application
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("hexlet.code.App")
}

checkstyle {
    toolVersion = "10.12.4"
}

sonar {
    properties {
        property ("sonar.projectKey", "Met-s_Hexlet")
        property ("sonar.organization", "met-s-1")
    }
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.apache.commons:commons-lang3:3.18.0")

    implementation("info.picocli:picocli:4.7.7")
    annotationProcessor("info.picocli:picocli-codegen:4.7.7")
}

tasks.test {
    useJUnitPlatform()
}
