/*
 * @(#)RolFeatureEntity.java.
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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * RolFeatureEntity.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@IdClass(RoleFeaturePK.class)
@Table(name = "role_feature", schema = "general")
public class RoleFeatureEntity implements Serializable {
    @Id
    @Column(name = "role_id")
    private RoleEntity role;
    @Id
    @Column(name = "feature_id")
    private FeatureEntity feature;
    @Column(name = "active")
    private Boolean active;

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }
}
