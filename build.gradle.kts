plugins {
    val kotlinVersion = "1.8.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "2.16.0"
}

group = "cn.chahuyun"
version = "0.0.1"

repositories {
    mavenCentral()
    maven("https://maven.aliyun.com/repository/public")
}

dependencies {

    //sqlite的方言支持
    api("org.hibernate.orm:hibernate-community-dialects:6.3.0.Final")


    implementation("xyz.cssxsh.mirai:mirai-hibernate-plugin:2.7.1")
    implementation("cn.chahuyun.api:huyan-public-api:0.0.1")

    implementation("org.projectlombok:lombok:1.18.26")
    annotationProcessor("org.projectlombok:lombok:1.18.26")

    implementation("cn.hutool:hutool-all:5.8.26")
    testImplementation("xyz.cssxsh.mirai:mirai-hibernate-plugin:2.7.1")


}

mirai {
    jvmTarget = JavaVersion.VERSION_11
}