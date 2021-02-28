FROM openjdk:8-jdk-alpine

LABEL maintainer="nemchinovrp@yandex.ru"

EXPOSE 8080

ARG JAR_FILE=target/springboot_kubernates.jar

ADD ${JAR_FILE} springboot_kubernates.jar

ENTRYPOINT ["java","-jar","/springboot_kubernates.jar"]
