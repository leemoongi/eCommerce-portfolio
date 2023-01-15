package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private Long userId;

    private LocalDateTime creDate;

    private String status;

}
