package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private Long userId;

    private LocalDateTime creDate;

    private String status;

}
