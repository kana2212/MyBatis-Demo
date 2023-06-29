package com.example.MyBatisMember.mapper;

import com.example.MyBatisMember.entity.Member;
import com.example.MyBatisMember.entity.MemberForm;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM members")
    List<Member> findAll();

    @Insert("INSERT INTO members (id, name, age) VALUES (#{id}, #{name}, #{age}")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createMember(MemberForm form);
}
