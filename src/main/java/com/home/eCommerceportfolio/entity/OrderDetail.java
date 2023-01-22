package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private Order order;

    @ManyToOne(fetch = LAZY)
    private Product product;

    private String productPrice;

    private Long productCount;

    private String ordersColor;

    private String orderSize;

    private Long orderPrice;
}
