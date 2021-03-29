/*
 * @(#)UserRolPKTest.java.
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
 * UserRolPKTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
class UserRolPKTest {

    @Test
    void gettersAndSetters() {
        final var userRolPK = new UserRolPK();
        final var userEntity = new UserEntity();
        final var rolEntity = new RolEntity();
        final var features = new HashSet<RolFeatureEntity>();
        final var users = new HashSet<UserRolEntity>();
        final var userRolPK2 = new UserRolPK();
        final var userEntity2 = new UserEntity();
        final var rolEntity2 = new RolEntity();
        final var features2 = new HashSet<RolFeatureEntity>();
        final var users2 = new HashSet<UserRolEntity>();

        rolEntity.setId(3);
        rolEntity.setName("Rol 0001");
        rolEntity.setDescription("Descripción del rol");
        rolEntity.setActive(true);
        rolEntity.setRolFeatures(features);
        rolEntity.setUserRolEntities(users);

        userEntity.setId(7L);
        userEntity.setAlias("Alias de usuario 2");
        userEntity.setActive(true);
        userEntity.setPassword("34567890");
        userEntity.setPerson(new PersonEntity());

        userRolPK.setUser(userEntity);
        userRolPK.setRol(rolEntity);
        final var userRolPK3 = userRolPK;

        rolEntity2.setId(3);
        rolEntity2.setName("Rol 0002");
        rolEntity2.setDescription("Descripción del rol 2");
        rolEntity2.setActive(true);
        rolEntity2.setRolFeatures(features2);
        rolEntity2.setUserRolEntities(users2);

        userEntity2.setId(4L);
        userEntity2.setAlias("Alias de usuario 2");
        userEntity2.setActive(true);
        userEntity2.setPassword("34567890");
        userEntity2.setPerson(new PersonEntity());

        userRolPK2.setUser(userEntity2);
        userRolPK2.setRol(rolEntity2);

        Assertions.assertAll("Test Getters and Setters",
            () -> Assertions.assertNotNull(userRolPK.getRol()),
            () -> Assertions.assertNotNull(userRolPK.getUser()),
            () -> Assertions.assertNotNull(userRolPK.toString()),
            () -> Assertions.assertNotEquals(1, userRolPK.hashCode()),
            () -> Assertions.assertNotEquals(userRolPK2, userRolPK),
            () -> Assertions.assertNotEquals(null, userRolPK),
            () -> Assertions.assertEquals(userRolPK,userRolPK3)
        );

    }
}