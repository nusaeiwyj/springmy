package com.nusaeiwyj.springmy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.nusaeiwyj.springmy.generator"})
public class SpringmyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmyApplication.class, args);
    }

}
