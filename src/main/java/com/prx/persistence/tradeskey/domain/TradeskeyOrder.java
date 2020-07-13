package com.prx.persistence.tradeskey.domain;

import com.prx.commons.enums.types.CriptocurrencyType;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
@Data
@Entity
public class TradeskeyOrder implements Serializable {

    private Double amount;
    private Integer buyOrderId;
    private Integer sellOrderId;
    private String timestamp;
    private Double price;
    private Integer type;
    private Integer exchangeId;
    @Id @GeneratedValue
    private Long id;
    private CriptocurrencyType criptocurrencyType;


}
