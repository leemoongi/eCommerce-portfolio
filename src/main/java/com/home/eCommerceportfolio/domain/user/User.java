package com.home.eCommerceportfolio.domain.user;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "normal_id")
    private String normalId;

    @Column(name = "name")
    private String name;

    @Column(name = "nickname")
    private String nickName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "grade")
    private String grade;

    @Column(name = "last_logindate")
    private LocalDateTime lastLoginDate;

    @Column(name = "lock_flag")
    private Character lockFlag;

    @Column(name = "profile")
    private String profile;

    @Column(name = "point_sum")
    private Long pointSum;

    @Column(name = "reserves_sum")
    private Long reservesSum;

}
