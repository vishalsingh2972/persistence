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
public class ClosingData implements Serializable {
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
