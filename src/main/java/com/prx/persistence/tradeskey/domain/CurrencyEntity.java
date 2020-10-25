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

import com.prx.commons.util.JsonUtil;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.AUTO;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CurrencyEntity.
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @version 1.0.2.20200904-01, 2020-10-25
 */
@Setter
@Getter
@Entity
@NoArgsConstructor
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
    private transient ActiveTypeEntity activeType;

    @Override public String toString() {
        return JsonUtil.toJson(this);
    }
}
