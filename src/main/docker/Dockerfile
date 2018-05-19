FROM isuper/java-oracle
VOLUME /tmp
ADD SpringBootWithDocker-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8011