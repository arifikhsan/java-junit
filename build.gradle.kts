plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
    implementation("org.junit.jupiter:junit-jupiter:5.9.0-M1")
    testImplementation("org.mockito:mockito-core:4.6.0")
    compileOnly("org.projectlombok:lombok:1.18.24")
    testImplementation("org.mockito:mockito-junit-jupiter:4.6.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}