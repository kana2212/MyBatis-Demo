package com.example.MyBatisMember;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;

    public MemberServiceImpl(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    @Override
    public List<Member> findAll() {
        return memberMapper.findAll();
    }

    @Override
    public List<String> findAllName() {
        return memberMapper.findAllName();
    }

    @Override
    public List<Member> findOverAge(String age) {
        return memberMapper.findOverAge(age);
    }
}







