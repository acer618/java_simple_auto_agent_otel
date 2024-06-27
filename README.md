Prerequisites
Ensure that you have the following installed locally:

Java JDK 17+, due to the use of Spring Boot 3; Java 8+ otherwise
Gradle https://medium.com/@brucetushabe/how-to-install-gradle-on-amazon-ec2-ubuntu-20-04-743807c0a53c


Build 
gradle assemble


Run

java -javaagent:libs/opentelemetry-javaagent.jar \
     -Dotel.javaagent.configuration-file=config.properties \
     -jar build/libs/java_simple_otel.jar

