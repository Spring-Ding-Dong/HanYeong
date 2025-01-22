package com.springdingdong.hany.week2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Member {
    @Id
    private Long id;
    private String name;
    private int age;


    public Member(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
