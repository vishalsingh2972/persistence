/*
 *  @(#)ExchangeEntity.java
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
import java.util.Objects;
import java.util.Set;

import static com.prx.commons.util.JsonUtil.toJson;
import static javax.persistence.GenerationType.AUTO;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "exchange", schema = "tradeskey")
public class ExchangeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "id_exchange")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "time_zone")
    private String timeZone;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "headquarters")
    private String headquarters;
    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(
            name = "exchange_instrument",
            schema = "tradeskey",
            joinColumns = @JoinColumn(name = "id_exchange", referencedColumnName = "id_exchange"),
            inverseJoinColumns = @JoinColumn(name = "id_instrument", referencedColumnName = "id_instrument")
    )
    private Set<InstrumentEntity> instruments;

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
        final ExchangeEntity other = (ExchangeEntity) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    @Override
    public String toString(){
        return toJson(this);
    }
}
