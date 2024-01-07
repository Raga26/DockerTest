FROM eclipse-temurin:17

LABEL maintainer = "mragamaliga@gmail.com"

WORKDIR /app

COPY target/springboot-docker-sample-0.0.1-SNAPSHOT.jar /app/springboot-docker-sample-applicaion.jar

ENTRYPOINT ["java" , "-jar" ,"springboot-docker-sample-applicaion.jar"]
