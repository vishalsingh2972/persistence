/*
 * @(#)RolEntity.java.
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package com.prx.persistence.general.domains;

import com.prx.commons.util.JsonUtil;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * RolEntity.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "rol", schema = "general")
public class RolEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private Boolean status;
    @OneToMany(mappedBy = "rol",
        fetch = LAZY,
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
    private Set<UserRolEntity> userRoles;
    @OneToMany(mappedBy = "rol",
        fetch = LAZY,
        cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
        })
    private Set<RolFeatureEntity> rolFeatures;

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }

}
