package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String normalId;

    private String nickName;

    private String email;

    private String password;

    private String role;

    private String grade;

    private LocalDateTime lastLoginDate;

    private Character lockFlag;

    private String profile;

    private Long pointSum;

    private Long reservesSum;

}
