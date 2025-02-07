FROM openjdk:21
VOLUME /tmp
ARG JAR_FILE=target/*.jar
ARG OPEN_TELEMETRY=target/agent/opentelemetry-javaagent*.jar
COPY ${JAR_FILE} app.jar
COPY ${OPEN_TELEMETRY} opentelemetry-javaagent.jar
ENTRYPOINT java \
            -javaagent:opentelemetry-javaagent.jar\
            -Dotel.traces.exporter=logging\
            -Dotel.metrics.exporter=logging\
            -Dotel.logs.exporter=logging\
            -jar app.jar