/*
 * @(#)RolEntityTest.java.
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

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * RolEntityTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
class RoleEntityTest {

    @Test
    void gettersAndSetters() {
        final var roleEntity = new RoleEntity();
        final var features = new HashSet<RoleFeatureEntity>();
        final var users = new HashSet<UserRoleEntity>();

        roleEntity.setId(3L);
        roleEntity.setName("Rol 0001");
        roleEntity.setDescription("Description rol");
        roleEntity.setActive(true);
        roleEntity.setRoleFeatures(features);
        roleEntity.setUserRoleEntities(users);

        Assertions.assertAll("Test Getters and Setters",
            () -> Assertions.assertNotNull(roleEntity.getId()),
            () -> Assertions.assertNotNull(roleEntity.getName()),
            () -> Assertions.assertNotNull(roleEntity.getDescription()),
            () -> Assertions.assertTrue(roleEntity.isActive()),
            () -> Assertions.assertNotNull(roleEntity.getRoleFeatures()),
            () -> Assertions.assertNotNull(roleEntity.getUserRoleEntities()),
            () -> Assertions.assertNotNull(roleEntity.toString()),
            () -> Assertions.assertNotEquals(1, roleEntity.hashCode()),
            () -> Assertions.assertNotEquals(new RoleEntity(), roleEntity)
        );

    }

}
