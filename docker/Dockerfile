FROM openjdk:8
VOLUME /date/xxljob

MAINTAINER xuxueli

ENV PARAMS=""
ENV TZ=PRC
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD xxl-job-simple-0.0.1-SNAPSHOT.jar xxl-job-simple.jar
EXPOSE 8091
ENTRYPOINT ["java","-jar","/xxl-job-simple.jar"]
