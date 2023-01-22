package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class ProductImg {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Product product;

    private String orgName;

    private String name;

    private Character delFlag;

    private Long fileSize;

}
