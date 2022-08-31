FROM openjdk:8-jdk-alpine

RUN addgroup -S desenv && adduser -S desenv -G desenv
USER desenv:desenv

VOLUME /tmp
ARG JAR_FILE
COPY build/libs/student-api-0.0.1.jar /student-api.jar
ENTRYPOINT ["java", "-jar", "student-api.jar", "-Dspring.active.profiles=default"]