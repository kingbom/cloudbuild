# Use official base image of Java Runtim
#FROM openjdk:8u191-alpine3.9
FROM openjdk:8-jre
RUN apt-get install -y libfontconfig

# Set volume point to /tmp
VOLUME /tmp

# Make port 9080 and 5555 available to the world outside container
EXPOSE 9080 5555

# Set application's JAR file
ARG JAR_FILE=cloudbuild-0.0.1-SNAPSHOT.jar

# Add the application's JAR file to the container
ADD target/${JAR_FILE} app.jar

# Run the JAR file
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]