# dockerization
Dockerization with fabric8 of spring boot application

-----------------------

### Requirements

For building and running the application you need:
- [JDK 8](https://www.oracle.com/tr/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven](https://maven.apache.org)
- [Docker](https://www.docker.com/)

-----------------------

### Build & Run

- mvn clean install

- docker-compose -f docker-compose.yml up -d

- docker run -p 8081:8081 project_name 

-----------------------


### Port     
 ```
 application : http://localhost:8081/hello  
 
```
