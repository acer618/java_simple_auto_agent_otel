plugins {
  id("java")
  id("org.springframework.boot") version "3.0.6"
  id("io.spring.dependency-management") version "1.1.0"
}

sourceSets {
  main {
    java.setSrcDirs(setOf("."))
  }
}

repositories {
  mavenCentral()
}

dependencyManagement {
  imports {
    mavenBom("io.opentelemetry:opentelemetry-bom:1.39.0")
  }
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("io.opentelemetry:opentelemetry-api");
}

