package com.springdingdong.hany.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @PostMapping("/member")
    public String postMember(@RequestBody final Member member) {
        return "Member received: " + member.toString();
    }
}