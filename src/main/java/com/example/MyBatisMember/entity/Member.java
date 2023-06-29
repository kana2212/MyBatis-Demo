package com.example.MyBatisMember.entity;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Member {

    private int id;
    @NotEmpty
    private String name;
    private String age;

}
