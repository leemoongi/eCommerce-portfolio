package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private Long orderId;

    private Long productId;

    private String productPrice;

    private Long productCount;

    private String ordersColor;

    private String orderSize;

    private Long orderPrice;
}
