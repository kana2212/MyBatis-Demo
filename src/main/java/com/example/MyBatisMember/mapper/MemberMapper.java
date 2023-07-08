package com.example.MyBatisMember.mapper;

import com.example.MyBatisMember.entity.Member;
import com.example.MyBatisMember.entity.MemberForm;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {

    @Select("SELECT * FROM members")
    List<Member> findAll();

    @Select("SELECT * FROM members WHERE id = #{id}")
    Optional<Member> findById(int id);

    @Insert("INSERT INTO members (id, name, age) VALUES (#{id}, #{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createMember(MemberForm form);

    @Update("UPDATE members SET name = #{name} WHERE id = #{id}")
    void updateMemberById(int id, String name);

    @Delete("DELETE FROM members WHERE id = #{id}")
    void deleteMemberById(int id);
}
