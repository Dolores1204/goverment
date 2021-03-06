package com.qtatelier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author xiaweiwei
 * @descrpition
 * @email xiaww@redoornetwork.com(xia.weiwei163@163.com)
 * @qq 1104841692
 * @time 2020-02-22 11:37
 */
@SpringBootApplication
//开启缓存(redis)
@EnableCaching
//开启事务管理
@EnableTransactionManagement
//开启swagger
@EnableSwagger2
@EnableScheduling
public class GovermentApplication {
    public static void main(String [] args) {
        SpringApplication.run(GovermentApplication.class,args);
    }
}
