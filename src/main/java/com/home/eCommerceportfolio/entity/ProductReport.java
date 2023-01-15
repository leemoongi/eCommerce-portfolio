package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class ProductReport {

    @Id
    @GeneratedValue(strategy = AUTO)
    private String id;

    private Long productId;

    private String reason;

    private String content;

    private LocalDateTime regDate;

    private String status;

}
