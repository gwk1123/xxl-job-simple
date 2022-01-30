package com.xxl.job.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * docker部署xxl-job镜像，启动成功却无法访问 (编辑这个目录下的文件 /usr/lib/sysctl.d/00-system.conf )
 * https://blog.csdn.net/qq_40397586/article/details/120783718
 * https://www.cnblogs.com/jinanxiaolaohu/p/8309690.html
 */

@EnableEurekaClient
@SpringBootApplication
public class XxlJobSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxlJobSimpleApplication.class, args);
    }

}
