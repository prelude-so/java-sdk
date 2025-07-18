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
    // Use `./gradlew :prelude-java-example:run` to run `Main`
    // Use `./gradlew :prelude-java-example:run -Dexample=Something` to run `SomethingExample`
    mainClass = "so.prelude.sdk.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
