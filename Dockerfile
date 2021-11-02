#define base docker image
FROM openjdk:11
LABEL maintainer="blessing"
ADD target/user-0.0.1-SNAPSHOT.jar user-docker.jar
ENTRYPOINT ["java", "-jar", "user-docker.jar"]