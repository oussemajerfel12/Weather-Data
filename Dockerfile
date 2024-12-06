FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/Weather-Data-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
