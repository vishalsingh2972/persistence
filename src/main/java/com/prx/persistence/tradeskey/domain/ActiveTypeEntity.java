/*
 *  @(#)ActiveTypeEntity.java
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

import static com.prx.commons.util.JsonUtil.toJson;
import static javax.persistence.GenerationType.AUTO;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "active_type", schema = "tradeskey")
public class ActiveTypeEntity {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "id_active_type")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "active")
    private Boolean active;
    
    @Override
    public String toString(){
        return toJson(this);
    }
    
}
