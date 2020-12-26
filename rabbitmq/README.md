# RabbitMQ

### This is a RabbitMQ project.

### Tech Stack
  - Java 11
  - Spring Boot
  - RabbitMQ
  - Docker
  - Gradle
  - Lombok
  
### Requirements

For building and running the application you need:
- [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or newer . 
- [Gradle](https://gradle.org/)
- [Docker](https://www.docker.com/)
- [Lombok](https://projectlombok.org)

### Build & Run 

```
  docker-compose -f "YOUR_LOCATION\docker-compose.yml" up -d 
```

```
  ./gradlew clean build && RabbitMQ spring-boot:run
```

### Port
```
  http://localhost:8085
```

### RabbitMQ port ,username and password
```
  http://localhost:15672
  username:mehmetpekdemir
  password:mehmetpekdemir
  
```

![RabbitMQ](https://github.com/mehmetpekdemir/RabbitMQ/blob/develop/RabbitMQ/RabbitMQ.png)
