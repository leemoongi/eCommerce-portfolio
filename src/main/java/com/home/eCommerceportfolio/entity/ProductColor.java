package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class ProductColor {

    @Id
    @GeneratedValue(strategy = AUTO)
    private String id;

    @ManyToOne(fetch = LAZY)
    private Product product;

    private String color;

    private String size;

    private Long price;

    private Long count;

}
