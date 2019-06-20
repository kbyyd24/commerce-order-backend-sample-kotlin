apply {
    plugin("checkstyle")
}

tasks.withType<Checkstyle>().configureEach {
    configFile = File("google_checks.xml")
    ignoreFailures = false
}