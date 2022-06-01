FROM openjdk:11.0-jre-slim
COPY "target/MSRegistryService-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8082
ENTRYPOINT ["java","-jar","app.jar"]
