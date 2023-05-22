package com.example.MyBatisMember;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {

        this.memberService = memberService;
    }

    @GetMapping("/members")
    public List<Member> members() {
        return memberService.findAll();
    }

    @GetMapping("/names")
    public List<String> getNames() {
        return memberService.findAllName();
    }

    @GetMapping("/ages")
    public List<Member> getAges() {
        return memberService.findAll();
    }
}
