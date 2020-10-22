/*
 *  @(#)Address.java
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

package com.prx.persistence.general.domain;

import com.prx.commons.util.JsonUtil;
import static javax.persistence.CascadeType.REFRESH;
import javax.persistence.Column;
import javax.persistence.Entity;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "address", schema = "general")
public class Address {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "description")
    private String description;
    @Column(name = "zipcode")
    private String zipcode;
    @ManyToOne(cascade = REFRESH, fetch = LAZY)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private PersonEntity person;

    public String toString() {
        return JsonUtil.toJson(this);
    }

}
