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

import com.prx.commons.util.JsonUtil;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DataValue.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @version 1.0.2.20200904-01, 2020-10-25
 */
@Getter
@Setter
@Entity
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
    private LocalDateTime dateTime;

    @Override public String toString() {
        return JsonUtil.toJson(this);
    }
}
