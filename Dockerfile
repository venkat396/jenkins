# Use a base image with JDK 17
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/simple_kubernets-0.0.1-SNAPSHOT.jar app.jar

# Define the command to execute when the container starts
ENTRYPOINT ["java", "-jar", "app.jar"]