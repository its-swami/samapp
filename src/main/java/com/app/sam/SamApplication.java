package com.app.sam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.app.sam"})
public class SamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SamApplication.class, args);
    }

}
