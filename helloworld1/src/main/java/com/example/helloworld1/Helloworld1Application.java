package com.example.helloworld1;

import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Builder
public class Helloworld1Application {

    public static void main(String[] args) {
        SpringApplication.run(Helloworld1Application.class, args);
    }

}
