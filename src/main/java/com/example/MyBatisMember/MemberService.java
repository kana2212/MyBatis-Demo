package com.example.MyBatisMember;

import java.util.List;

public interface MemberService {
    List<Member> findAll();

    List<String> findAllName();
    
    List<Member> findOverAge(String age);
}
