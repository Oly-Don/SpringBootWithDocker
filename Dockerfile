FROM java:8-alpine
MAINTAINER XXcompany<mail-server>
##运行时的XX包名称
ENV appName=SprintDocker
## 启动参数
ENV JAVA_OPTS="-Dlogging.path=/var/log"
VOLUME /tmp
##添加target文件夹下打好的包到容器
ADD ./target/*.jar $appName.jar
##容器启动脚本  docker+jdk时区
RUN apk add --no-cache tzdata && echo "${TIME_ZONE}" > /etc/timezone && ln -sf /usr/share/zoneinfo/${TIME_ZONE} /etc/localtime
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar $appName.jar"]
##暴露服务端口
EXPOSE 8080