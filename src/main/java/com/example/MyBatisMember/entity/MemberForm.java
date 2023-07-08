package com.example.MyBatisMember.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MemberForm {
    @NotNull
    private int id;
    @NotEmpty
    private String name;
    @NotNull
    private int age;
}
