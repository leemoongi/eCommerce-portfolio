package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class ProductImg {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private Long productId;

    private String orgName;

    private String name;

    private Character delFlag;

    private Long fileSize;

}
