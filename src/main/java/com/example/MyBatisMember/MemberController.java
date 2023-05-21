package com.example.MyBatisMember;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public List<Member> getMembers(@RequestParam(name = "age", required = false) String age) {
        if (age == null) {
            return memberService.findAll();
        } else {
            return memberService.findOverAge(age);
        }
    }

    @GetMapping("/names")
    public List<String> getNames() {
        return memberService.findAllName();
    }
}



