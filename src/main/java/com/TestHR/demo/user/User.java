package com.TestHR.demo.user;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private Long userId;
    private String name;
    private String surname;
    private String email;
    private String gender;
    private String idNumber;
    private UserRole role;
    private String race;
    private String location;
    private int age;

    public enum UserRole {
        APPLICANT, CONTRACTOR, INSTRUCTOR, ADMIN
    }
}

