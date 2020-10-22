/*
 *  @(#)TradeskeyTickerPK.java
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

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Llave primaria embebida para la entidad {@link TradeskeyTicker}
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
@Data
@Embeddable
public class TradeskeyTickerPK implements Serializable {

    @Column(name = "date_time")
    private LocalDateTime localDateTime;
    @Column(name = "fk_id_exchange")
    private Long idExchange;

}
