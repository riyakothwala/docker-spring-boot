FROM openjdk:11
MAINTAINER Riya 
ADD target/springlern-0.0.1-SNAPSHOT.jar springlern-docker.jar
ENTRYPOINT ["java", "-jar", "springlern-docker.jar"]