package com.vendor.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/Info")
    public String getInfo(){
        return "Spring Boot App is Dockerized successfully";
    }

}
