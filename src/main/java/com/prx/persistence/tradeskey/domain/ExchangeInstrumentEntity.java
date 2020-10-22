/*
 *  @(#)ExchangeInstrumentEntity.java
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

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@IdClass(ExchangeInstrumentPK.class)
@Table(name = "exchange_instrument", schema = "tradeskey")
public class ExchangeInstrumentEntity {
    @Id
    @Column(name = "id_instrument")
    private InstrumentEntity instrument;
    @Id
    @Column(name = "id_exchange")
    private ExchangeEntity exchange;

    @Column(name = "active")
    private Boolean active;
    @Column(name = "identifier")
    private String identifier;
}
