FROM java:8-alpine
VOLUME /tmp
## 修改 SpringBootWithDocker-1.0-SNAPSHOT.jar 为项目包名
ADD SpringBootWithDocker-1.0-SNAPSHOT.jar app.jar
##ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8080