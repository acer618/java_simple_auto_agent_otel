## Prerequisites

Java JDK 17+, due to the use of Spring Boot 3; Java 8+ otherwise
Gradle (w/ Kotlin support)

## Build 
`gradle assemble`

## Run

Export Traces to Jaeger 
https://www.apollographql.com/docs/router/configuration/telemetry/exporters/tracing/jaeger/

```
sudo docker run --name jaeger -e COLLECTOR_OTLP_ENABLED=true   -p 16686:16686   -p 4317:4317   -p 4318:4318   jaegertracing/all-in-one:1.35
```

```
java -javaagent:libs/opentelemetry-javaagent.jar \
     -Dotel.javaagent.configuration-file=config.properties \
     -jar build/libs/java_simple_otel.jar
     --server.port=8083 (if the springboot default 8080 is taken)
```

curl http://<IP>:rolldice

Jaeger UI to view the traces
http:<IP>:16686/

## Useful References

https://opentelemetry.io/docs/zero-code/java/agent/
https://github.com/open-telemetry/opentelemetry-java-instrumentation

https://opentelemetry.io/docs/languages/java/configuration/
https://opentelemetry.io/docs/languages/java/getting-started/
https://opentelemetry.io/docs/languages/java/instrumentation/#automatic-configuration
