FROM openjdk:11
EXPOSE 8084
WORKDIR /app
COPY target/dockerization-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar","dockerization-0.0.1-SNAPSHOT.jar"]