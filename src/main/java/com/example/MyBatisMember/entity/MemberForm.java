package com.example.MyBatisMember.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class MemberForm {
    @NotNull
    int id;
    @NotEmpty
    String name;
    @NotNull
    private int age;
}
