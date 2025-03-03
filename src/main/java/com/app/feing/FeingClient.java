package com.app.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "test", url = "${external.service}:8080")
public interface FeingClient {

    @GetMapping("/api/test")
    String test();
}
