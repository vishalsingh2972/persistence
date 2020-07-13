package com.prx.persistence.tradeskey.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class ExchangeInstrumentPK implements Serializable {
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_instrument", referencedColumnName = "id_instrument")
    private InstrumentEntity instrument;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_exchange", referencedColumnName = "id_exchange")
    private ExchangeEntity exchange;
}
