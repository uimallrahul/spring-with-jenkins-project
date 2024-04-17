FROM openjdk:17-jdk-slim-buster
ADD target/spring-jenkin-docker.jar spring-jenkin-docker.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","spring-jenkin-docker.jar" ]
MAINTAINER ndm