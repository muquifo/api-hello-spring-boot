FROM openjdk:8u121-jre-alpine
ADD ./hello-0.0.1-SNAPSHOT.jar hello.jar
EXPOSE 9090
ENTRYPOINT ["sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /hello.jar"]


