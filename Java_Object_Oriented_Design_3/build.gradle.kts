plugins {
    id("java")
    id("idea")
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

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.junit.platform:junit-platform-console:1.13.1")
    implementation("org.apache.commons:commons-lang3:3.18.0")
    compileOnly ("org.projectlombok:lombok:1.18.36")
    annotationProcessor ("org.projectlombok:lombok:1.18.36")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events ("passed", "skipped", "failed")
    }
}
