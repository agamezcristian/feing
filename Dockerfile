FROM eclipse-temurin:23.0.1_11-jre-alpine

WORKDIR /app

COPY ./build/libs/feing-0.0.1-SNAPSHOT.jar .

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "feing-0.0.1-SNAPSHOT.jar"]