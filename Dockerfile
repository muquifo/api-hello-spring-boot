FROM openjdk:8u121-jre-alpine
ADD ./target/hello-0.0.1-SNAPSHOT.jar api.jar
EXPOSE 9090
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /api.jar"]
