package com.example.TEST;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //endpoint
    @RequestMapping("/test")
    public String getNumber() {
        return "8888889999999";
    }
}
