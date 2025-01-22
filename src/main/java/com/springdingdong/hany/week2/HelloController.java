package com.springdingdong.hany.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("name/{name}")
    public String getName(@PathVariable(value = "name") final String name) {
        return name;
    }

    @GetMapping("/pda")
    public String getPart(
            @RequestParam(value = "part", defaultValue = "") final String part,
            @RequestParam(value = "age", defaultValue = "0") final String age
    ) {
        return "파트는" + part + "나이는" + age;
    }


}