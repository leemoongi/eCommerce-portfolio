package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private User user;

    private String deliverAddress;

    private Character bestFlag;

}
