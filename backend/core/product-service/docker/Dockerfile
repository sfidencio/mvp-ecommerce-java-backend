FROM maven:3-openjdk-17 AS stage1
LABEL authors="sebastiaofidencio"
ENV MAVEN_OPTS="-XX:+TieredCompilation -XX:TieredStopAtLevel=1"
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY ./src ./src
RUN mvn clean package -DskipTests

FROM openjdk:17-alpine AS stage2
RUN apk update && apk add --no-cache curl vim bash iputils htop
WORKDIR /app
COPY --from=stage1 /app/target/*.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
#CMD ["java","-Dspring.profiles.active=dev", "-jar", "app.jar"]
