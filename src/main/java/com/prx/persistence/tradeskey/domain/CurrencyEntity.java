package com.prx.persistence.tradeskey.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.AUTO;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "currency", schema = "tradeskey")
public class CurrencyEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "id_currency")
    private Integer id;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "name")
    private String name;
    @Column(name = "active")
    private Boolean active;
    @OneToOne(fetch = LAZY, optional = false, targetEntity = ActiveTypeEntity.class)
    @JoinColumn(name = "fk_active_type_id")
    private ActiveTypeEntity activeType;
}
