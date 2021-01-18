/*
 * @(#)UserRolPk.java.
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
package com.prx.persistence.general.domain;

import com.prx.commons.util.JsonUtil;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * UserRolPk.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
@Getter
@Setter
@Entity
@NoArgsConstructor
@IdClass(UserRolPK.class)
@Table(name = "user_rol", schema = "general")
public class UserRolEntity implements Serializable {

    @Id
    @Column(name = "user_id")
    private UserEntity user;
    @Id
    @Column(name = "rol_id")
    private RolEntity rol;
    @Column(name = "status")
    private Boolean status;

    @Override public String toString() {
        return JsonUtil.toJson(this);
    }
}
