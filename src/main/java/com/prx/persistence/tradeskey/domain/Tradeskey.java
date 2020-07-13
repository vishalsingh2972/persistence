package com.prx.persistence.tradeskey.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Tradeskey {

    private Double amount;
    private Integer buyOrderId;
    private Integer sellOrderId;
    private String timestamp;
    private Double price;
    private Integer type;
    private Integer exchangeId;
    @Id @GeneratedValue
    private Long id;

}
