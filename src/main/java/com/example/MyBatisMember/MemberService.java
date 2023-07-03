package com.example.MyBatisMember;

import com.example.MyBatisMember.entity.Member;
import com.example.MyBatisMember.entity.MemberForm;

import java.util.List;


public interface MemberService {
    List<Member> findAll();

    Member findById(int id);

    void createMember(MemberForm form);
}
