package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = AUTO)
    private String categoryCode;

    private String categoryName;

}
