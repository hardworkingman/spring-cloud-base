package com.song.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystrix implements FeignService{

    @Override
    public String sayHiFromClientOne(String name) {
        return "find error, sorry " + name;
    }
}
