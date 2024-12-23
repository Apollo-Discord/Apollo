import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    java
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

application.mainClass.set("com.kernsz.Apollo.bot.Main")
group = "com.kernsz.Apollo")
version = "1.0-SNAPSHOT"

tasks.withType<ShadowJar> {
    archiveFileName.set("Apollo.jar")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    //Logging
    implementation("ch.qos.logback:logback-classic:1.5.6")

    //JDA
    implementation("club.minnced:jda-ktx:0.12.0")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.isIncremental = true

    //JDA supports Java 8 and above
    sourceCompatibility = "1.8"
}
