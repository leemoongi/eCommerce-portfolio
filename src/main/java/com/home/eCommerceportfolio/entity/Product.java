package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String categoryCode;

    private String name;

    private String content;

    private LocalDateTime creDate;

    private Long hint;

}
