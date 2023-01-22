package com.home.eCommerceportfolio.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
public class Inquiry {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @ManyToOne(fetch = LAZY)
    private User usert;

    private String type;

    private String subject;

    private String content;

    private LocalDateTime regDate;

    private String status;

}
