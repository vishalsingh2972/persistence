/*
 *  @(#)CurrencyEntity.java
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
