package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Coupon {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private String categoryCode;

    private Long minimumPrice;

    private String saleType;

    private Long saleValue;

    private String status;

    private LocalDateTime creDate;

    private LocalDateTime expiredDate;

}
