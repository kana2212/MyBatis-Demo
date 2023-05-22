package com.example.MyBatisMember;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM members")
    List<Member> findAll();

    @Select("SELECT name FROM members")
    List<String> findAllName();

    @Select("SELECT * FROM members WHERE age >= #{age}")
    List<Member> findALlAge();
}
