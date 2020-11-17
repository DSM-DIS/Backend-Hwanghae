FROM openjdk:11-jre-slim
COPY ./build/libs/*.jar hwanghae.jar
ENTRYPOINT ["java", "-Xmx100m", "-jar", "/hwanghae.jar"]
