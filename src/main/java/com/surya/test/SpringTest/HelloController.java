package com.surya.test.SpringTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    public String welcome(){
        return  "welcome form spring boot";
    }

    @GetMapping("/user/{name}")
    public String welcomeUser(@PathVariable String name) {
        return "welcome to spring boot" + name;
    }
}
