package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Coupon {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "categoryCode")
    private ProductCategory categoryCode;

    private Long minimumPrice;

    private String saleType;

    private Long saleValue;

    private String status;

    private LocalDateTime creDate;

    private LocalDateTime expiredDate;

}
