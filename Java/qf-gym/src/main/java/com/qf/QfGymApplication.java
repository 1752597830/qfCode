package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: sin
 * @Date: 2023/1/2 - 01 - 02 - 13:37
 * @Description: com.qf
 * @version: 1.0
 */

@SpringBootApplication
@MapperScan("com.qf.mapper")
public class QfGymApplication {
    public static void main(String[] args) {
        SpringApplication.run(QfGymApplication.class, args);
    }
}