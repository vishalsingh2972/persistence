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
