# openjdk from dockerhub
FROM openjdk:8
#add the jar to the docker container
ADD target/docker-spring-boot.jar docker-spring-boot.jar
#Expose it to the specific port
EXPOSE 8085
#Give the entry point
ENTRYPOINT["java","-jar","docker-spring-boot.jar"]