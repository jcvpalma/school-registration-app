FROM openjdk:8-jdk-alpine

RUN addgroup -S desenv && adduser -S desenv -G desenv
USER desenv:desenv

VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} student-api.jar
ENTRYPOINT ["java", "-jar", "/student-api.jar"]