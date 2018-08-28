FROM openjdk:11-jdk
WORKDIR /
ADD target/vjService-1.0.jar vjService.jar
EXPOSE 80
CMD ["java", "-jar", "vjService.jar"]