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

import com.prx.commons.util.JsonUtil;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ExchangeInstrumentEntity.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @version 1.0.2.20200904-01, 2020-10-25
 */
@Setter
@Getter
@Entity
@NoArgsConstructor
@IdClass(ExchangeInstrumentPK.class)
@Table(name = "exchange_instrument", schema = "tradeskey")
public class ExchangeInstrumentEntity implements Serializable {
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

    @Override public String toString() {
        return JsonUtil.toJson(this);
    }
}
