FROM openjdk:8
VOLUME /data/xxljob
ADD xxl-job-simple-0.0.1-SNAPSHOT.jar xxl-job-simple.jar
EXPOSE 8092
#修改Docker时区-否则里面的时间会慢8小时 通过文件链接的方式修改 时区
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
ENTRYPOINT ["java","-jar","/xxl-job-simple.jar"]
