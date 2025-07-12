plugins {
    application
    jacoco
    id("java")
    id("eclipse")
    id("idea")

}

group = "io.hexlet"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("io.hexlet.App")
}

jacoco {
    toolVersion = "0.8.13"
    reportsDirectory = layout.buildDirectory.dir("customJacocoReportDir")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("org.junit.platform:junit-platform-console:1.13.1")
    implementation("org.apache.commons:commons-lang3:3.17.0")
    implementation("org.apache.commons:commons-lang3:3.0")

    compileOnly ("org.projectlombok:lombok:1.18.36")
    annotationProcessor ("org.projectlombok:lombok:1.18.36")

    implementation ("commons-io:commons-io:2.6")

    implementation ("com.fasterxml.jackson.core:jackson-databind:2.12.4")
    implementation ("com.fasterxml.jackson.core:jackson-annotations:2.12.4")
    implementation ("com.fasterxml.jackson.core:jackson-core:2.12.4")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.19.1")
    testImplementation("org.assertj:assertj-core:4.0.0-M1")
    testImplementation ("org.junit.jupiter:junit-jupiter-params:5.10.0")

}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events ("passed", "skipped", "failed")
    }
    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests ru
}

tasks.jacocoTestReport { reports { xml.required.set(true) } }
tasks.jacocoTestReport {
    reports {
        xml.required = true
        csv.required = true
        html.outputLocation = layout.buildDirectory.dir("jacocoHtml")
    }
}
