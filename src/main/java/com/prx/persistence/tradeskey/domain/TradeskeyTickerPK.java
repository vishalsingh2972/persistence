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
