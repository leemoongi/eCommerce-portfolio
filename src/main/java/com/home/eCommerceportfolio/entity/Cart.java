package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Product product;

    @ManyToOne(fetch = LAZY)
    private User user;

    private Long productCnt;

}
