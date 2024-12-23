/*
 * This file was generated by the Gradle "init" task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("java-library")
    id("maven-publish")
    id("application")
}

repositories {
    mavenLocal()
    mavenCentral()
}


dependencies {
    implementation("org.apache.tomcat.embed:tomcat-embed-core:10.1.33")
    api("mysql:mysql-connector-java:8.0.23")
    api("org.json:json:20210307") 
    compileOnly("jakarta.servlet:jakarta.servlet-api:6.1.0")

    api("org.slf4j:slf4j-api:2.0.0") 

    api("ch.qos.logback:logback-classic:1.4.7")


    testImplementation("junit:junit:4.13.2")

}



group = "com.wm"
version = "1.0-SNAPSHOT"
description = "LeaveManagement Maven Webapp"
// java.sourceCompatibility = JavaVersion.VERSION_1_8

tasks.withType<JavaCompile> {
    sourceCompatibility = "17"
    targetCompatibility = "17"
    options.encoding = "UTF-8"
}



publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}

application{
	mainClass.set("com.wavemaker.leavemanagement.Main")
}	
