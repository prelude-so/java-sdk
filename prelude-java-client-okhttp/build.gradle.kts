plugins {
    id("prelude.kotlin")
    id("prelude.publish")
}

dependencies {
    api(project(":prelude-java-core"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.25.3")
}
