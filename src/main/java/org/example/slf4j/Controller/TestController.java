package org.example.slf4j.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/error-test")
    public String errorTest() {

        int result = 10 / 0;

        return "Result = " + result;
    }
}