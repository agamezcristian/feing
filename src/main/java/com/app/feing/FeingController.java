package com.app.feing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class FeingController {

    @Autowired
    private FeingClient feingClient;

    @GetMapping("/gretting")
    public ResponseEntity<String> test() {
        log.info("execute service");
        return ResponseEntity.ok("Hello from microservice 2");
    }

    @GetMapping("/test")
    public ResponseEntity<String> gretting() {
        log.info("call microservices 1");
        return ResponseEntity.ok(feingClient.test());
    }
}
