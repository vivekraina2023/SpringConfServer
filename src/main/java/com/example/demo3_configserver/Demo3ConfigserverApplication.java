package com.example.demo3_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Demo3ConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo3ConfigserverApplication.class, args);
    }

}
