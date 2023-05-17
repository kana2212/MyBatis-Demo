package com.example.MyBatisMember;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MemberServiceImpl implements MemberService{
    private final MemberMapper memberMapper;
    public MemberServiceImpl(MemberMapper memberMapper){
        this.memberMapper = memberMapper;
    }
    @Override
    public List<Member>findAll(){
        return memberMapper.findAll();
    }
}
