package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class ProductColor {

    @Id
    @GeneratedValue(strategy = AUTO)
    private String id;

    private Long productId;

    private String color;

    private String size;

    private Long price;

    private Long count;

}
