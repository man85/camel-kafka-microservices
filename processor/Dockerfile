FROM openjdk:11
EXPOSE 8080
EXPOSE 9092
COPY target/*jar-with-dependencies.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]