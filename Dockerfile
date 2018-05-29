FROM java:8-alpine
MAINTAINER XX公司  "邮箱"
##运行时名称
ARG appName=runtimeName
VOLUME /tmp

ADD ./target/*.jar $appName.jar
CMD echo $appName
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","$appName.jar"]
EXPOSE 8080