package com.song.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

    @Value("${server.port}")
    private String port;
    @Value("${foo}")
    private String foo;

    @RequestMapping("/hi")
    public String hi(@RequestParam(defaultValue = "xinZone") String name) {
        return "hi " + name + ",i am from port: " + port;
    }

    @RequestMapping("/notfound")
    public String notfound() {
        return "迷路了e....";
    }

    @RequestMapping("/foo")
    public String foo() {
        return "hi " + foo;
    }
}
