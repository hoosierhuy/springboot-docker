FROM openjdk:10
ADD target/docker-spring-boot.jar huySpringBoot.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "huySpringBoot.jar"]