/*
 *  @(#)TradeskeyTicker.java
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

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Entidad para la tabla ticker del esquema tradeskey
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
@Data
@Entity
@Table(name = "ticker", schema = "tradeskey")
@IdClass(TradeskeyTickerPK.class)
public class TradeskeyTicker implements Serializable {

    @Id
    @Column(name = "date_time")
    private LocalDateTime localDateTime;
    @Id
    @Column(name = "fk_id_exchange")
    private Integer idExchange;
    @Column(name = "bid")
    private Double bid;
    @Column(name = "bid_size")
    private Double bidSize;
    @Column(name = "ask")
    private Double ask;
    @Column(name = "ask_size")
    private Double askSize;
    @Column(name = "daily_change")
    private Double dailyChange;
    @Column(name = "daily_change_perc")
    private Double dailyChangePerc;
    @Column(name = "volume")
    private Double volume;
    @Column(name = "high")
    private Double high;
    @Column(name = "low")
    private Double low;
    @Column(name = "last_price")
    private Double lastPrice;
    @Column(name = "parity")
    private String parity;
    @Transient
    private CriptocurrencyType criptocurrencyTypeSource;
    @Transient
    private CriptocurrencyType criptocurrencyTypeTarget;

}
