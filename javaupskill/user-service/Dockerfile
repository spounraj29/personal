# multi-stage build
FROM maven:3.9.4-eclipse-temurin-21 AS build
WORKDIR /workspace
COPY pom.xml ./
COPY src ./src
RUN mvn -B package -DskipTests

FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /workspace/target/user-service-1.0.0.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app.jar"]
