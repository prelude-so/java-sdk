plugins {
    id("prelude.kotlin")
    id("prelude.publish")
}

dependencies {
    api(project(":prelude-java-client-okhttp"))
}
