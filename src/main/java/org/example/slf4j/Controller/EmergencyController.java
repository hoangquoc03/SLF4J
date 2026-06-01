package org.example.slf4j.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmergencyController {

    @GetMapping("/emergency")
    public String emergency() {

        int result = 10 / 0;

        return "Result = " + result;
    }
}