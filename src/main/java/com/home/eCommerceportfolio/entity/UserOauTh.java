package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class UserOauTh {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private Long userId;

    private String loginType;

    private String accessToken;

}
