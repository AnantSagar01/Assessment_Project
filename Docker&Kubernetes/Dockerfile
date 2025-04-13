FROM amazoncorretto:24

EXPOSE 8080:8080

WORKDIR /app

COPY target/info-0.0.1-SNAPSHOT.jar /app/info.jar

ENTRYPOINT [ "java", "-jar", "info.jar" ]




