package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class ProductReply {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private Long productId;

    private Long userId;

    private String content;

    private LocalDateTime regDate;

}
