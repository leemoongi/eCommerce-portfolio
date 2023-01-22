package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class ProductCategory {

    @Id
    private String categoryCode;

    private String categoryName;

}
