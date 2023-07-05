package com.example.MyBatisMember.controller;

import com.example.MyBatisMember.MemberService;
import com.example.MyBatisMember.entity.Member;
import com.example.MyBatisMember.entity.MemberForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;


@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {

        this.memberService = memberService;
    }

    @GetMapping("/members")
    public List<Member> getMembers() {
        return memberService.findAll();
    }

    @GetMapping("/members/{id}")
    public Member getMember(@PathVariable("id") int id) {
        return memberService.findById(id);
    }

    @PostMapping("/members")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Map<String, String>> create(@RequestBody MemberForm form, UriComponentsBuilder uriBuilder) {
        memberService.createMember(form);
        URI location = uriBuilder.path("/member/{id}").buildAndExpand(form.getId()).toUri();
        return ResponseEntity.created(location).body(Map.of("message", "successfully created"));
    }

}
