package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Inquiry {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    private Long userId;

    private String type;

    private String subject;

    private String content;

    private LocalDateTime regDate;

    private String status;

}
