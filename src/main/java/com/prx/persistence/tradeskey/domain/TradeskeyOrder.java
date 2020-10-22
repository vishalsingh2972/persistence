/*
 *  @(#)TradeskeyOrder.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */

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
