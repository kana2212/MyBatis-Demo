package com.example.MyBatisMember;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM mebers")
    List<Member> findAll();
}
