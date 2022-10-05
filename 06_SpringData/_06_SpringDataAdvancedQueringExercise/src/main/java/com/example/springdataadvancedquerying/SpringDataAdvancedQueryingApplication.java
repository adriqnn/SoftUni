package com.example.springdataadvancedquerying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//app.properties = server properties
//local.properties = local properties
//@PropertySource(value = {"classpath:app.properties", "classpath:local.properties"})
public class SpringDataAdvancedQueryingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataAdvancedQueryingApplication.class, args);
    }

}
