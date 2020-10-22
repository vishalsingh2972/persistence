/*
 *  @(#)InstrumentEntity.java
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

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "instrument", schema = "tradeskey")
public class InstrumentEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "id_instrument")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToOne(fetch = LAZY, optional = false, targetEntity = CurrencyEntity.class)
    @JoinColumn(name = "fk_currency_base")
    private CurrencyEntity currencySource;
    @OneToOne(fetch = LAZY, optional = false, targetEntity = CurrencyEntity.class)
    @JoinColumn(name = "fk_currency_variable")
    private CurrencyEntity currencyTarget;
    @Column(name = "active")
    private Boolean active;
    @ManyToMany(mappedBy = "instruments",
            fetch = LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    private Set<ExchangeEntity> exchanges;

    @Override
    public int hashCode() {
        return 58 * (null == name ? 0 : name.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InstrumentEntity other = (InstrumentEntity) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }

}
