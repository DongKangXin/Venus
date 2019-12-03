package com.venus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author dongkx
 * @version 0.0.1
 * @date 2019/12/3
 */
@SpringBootApplication
@EnableSwagger2
public class VenusApplication {

    public static void main(String[] args) {
        SpringApplication.run(VenusApplication.class, args);
    }
}
