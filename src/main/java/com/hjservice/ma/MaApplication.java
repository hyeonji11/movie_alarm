package com.hjservice.ma;

import com.hjservice.ma.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class MaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaApplication.class, args);
    }

}
