FROM openjdk:17-jdk-alpine
LABEL maintainer="e18283@eng.pdn.ac.lk"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/CO528-assignment1-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
