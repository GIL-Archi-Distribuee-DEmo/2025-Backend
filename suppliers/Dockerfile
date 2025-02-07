FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/suppliers-*.jar
ARG OPEN_TELEMETRY=target/agent/opentelemetry-javaagent.jar


COPY ${JAR_FILE} app.jar

COPY ${OPEN_TELEMETRY} opentelemetry-javaagent.jar


ENTRYPOINT java\
    -javaagent:opentelemetry-javaagent.jar\
    -jar app.jar