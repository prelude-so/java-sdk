# Specify the entrypoint where ProGuard starts to determine what's reachable.
-keep class so.prelude.sdk.proguard.** { *; }

# For the testing framework.
-keep class org.junit.** { *; }