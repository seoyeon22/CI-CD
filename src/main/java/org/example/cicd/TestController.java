package org.example.cicd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "test06";
    }

    @GetMapping("/health")
    public ResponseEntity health(){
        return ResponseEntity.status(HttpStatus.OK).body("ok");
    }
}
