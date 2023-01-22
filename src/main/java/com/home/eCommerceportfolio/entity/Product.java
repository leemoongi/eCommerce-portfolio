package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "categoryCode")
    private ProductCategory categoryCode;

    private String name;

    private String content;

    private LocalDateTime creDate;

    private Long hint;

}
