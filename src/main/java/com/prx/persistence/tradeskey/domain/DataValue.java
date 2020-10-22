/*
 *  @(#)DataValue.java
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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "data_value_ticker", schema = "tradeskey")
public class DataValue implements Serializable {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator="tradeskey.data_value_tick_id_seq")
    @SequenceGenerator(name="tradeskey.data_value_tick_id_seq", sequenceName="tradeskey.data_value_tick_id_seq", allocationSize=1)
    @Column(name = "id")
    private Long id;
    @Column(name = "bid")
    private Double bid;
    @Column(name = "ask")
    private Double ask;
    @Column(name = "last")
    private Double last;
    @Column(name = "volume")
    private Double volume;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "instrument_id")
    private InstrumentEntity instrumentEntity;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "exchange_id")
    private ExchangeEntity exchangeId;
    @Column(name="datetime")
    private LocalDateTime localDateTime;
}
