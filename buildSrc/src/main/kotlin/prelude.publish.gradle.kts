import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("Prelude API")
        description.set("The Prelude API allows you to send messages to your users.")
        url.set("https://docs.prelude.so")

        licenses {
            license {
                name.set("Apache-2.0")
            }
        }

        developers {
            developer {
                name.set("Prelude")
                email.set("hello@prelude.so")
            }
        }

        scm {
            connection.set("scm:git:git://github.com/prelude-so/java-sdk.git")
            developerConnection.set("scm:git:git://github.com/prelude-so/java-sdk.git")
            url.set("https://github.com/prelude-so/java-sdk")
        }
    }
}
