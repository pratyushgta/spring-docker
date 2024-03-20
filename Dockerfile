# define base docker imager ADD target/docker-demo-0.0.1-SNAPSHOT.jar springboot-docker-demo.jar
FROM openjdk:21
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
