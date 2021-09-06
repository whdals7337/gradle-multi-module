package com.multi2.module.controller;

import com.multi2.module.model.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping
    public Member member() {
        return Member.builder().id(332L).name("wellbell2").build();
    }
}
