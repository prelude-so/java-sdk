plugins {
    id("prelude.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":prelude-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "so.prelude.sdk.example.Main"
}
