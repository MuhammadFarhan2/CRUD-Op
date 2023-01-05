FROM openjdk:16.0.2
ADD target/*.jar app.jar
ENTRYPOINT  ["java","-jar","app.jar"]


