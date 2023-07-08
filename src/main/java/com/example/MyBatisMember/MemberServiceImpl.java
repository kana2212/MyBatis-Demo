package com.example.MyBatisMember;

import com.example.MyBatisMember.entity.Member;
import com.example.MyBatisMember.entity.MemberForm;
import com.example.MyBatisMember.exception.ResourceNotFoundException;
import com.example.MyBatisMember.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Member findById(int id) {
        Optional<Member> member = this.memberMapper.findById(id);
        if (member.isPresent()) {
            return member.get();
        } else {
            throw new ResourceNotFoundException("resource not found");
        }
    }

    @Override
    public void createMember(MemberForm form) {
        memberMapper.createMember(form);
    }

    @Override
    public Member updateMember(int id, String name, int age) {
        Member memberUpdate = memberMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("member not found"));
        memberMapper.updateMember(id, name, age);
        return memberUpdate;
    }

    @Override
    public Member deleteMember(int id) {
        Member deleteMember = memberMapper.findById(id).orElseThrow(() -> new ResourceNotFoundException("member not found"));
        memberMapper.deleteMemberById(id);
        return deleteMember;
    }
}
