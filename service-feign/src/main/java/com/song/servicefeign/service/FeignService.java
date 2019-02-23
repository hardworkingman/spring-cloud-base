package com.song.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "service-hi", fallback = FeignServiceHystrix.class)
public interface FeignService {

    @GetMapping("/hi")
    String  sayHiFromClientOne(@RequestParam(value = "name") String name);
}
