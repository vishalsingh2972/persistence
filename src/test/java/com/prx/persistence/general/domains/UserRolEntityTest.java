/*
 * @(#)UserRolEntityTest.java.
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

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

/**
 * UserRolEntityTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
class UserRolEntityTest {
    @Test
    void gettersAndSetters(){
        final var userRolEntity = new UserRolEntity();
        final var userEntity = new UserEntity();
        final var rolEntity = new RolEntity();
        final var features = new HashSet<RolFeatureEntity>();
        final var users = new HashSet<UserRolEntity>();

        rolEntity.setId(3);
        rolEntity.setName("Rol 0001");
        rolEntity.setDescription("Descripción del rol");
        rolEntity.setActive(true);
        rolEntity.setRolFeatures(features);
        rolEntity.setUserRolEntities(users);

        userEntity.setId(3L);
        userEntity.setAlias("Alias de usuario");
        userEntity.setActive(true);
        userEntity.setPassword("34567890");
        userEntity.setPerson(new PersonEntity());


        userRolEntity.setUser(userEntity);
        userRolEntity.setRol(rolEntity);
        userRolEntity.setActive(true);

        assertAll("Test Getters and Setters",
            () -> assertNotNull(userRolEntity.getRol()),
            () -> assertNotNull(userRolEntity.getUser()),
            () -> assertNotNull(userRolEntity.toString()),
            () -> assertNotNull(userRolEntity.getActive()),
            () -> assertNotEquals(1, userRolEntity.hashCode()),
            () -> assertNotEquals(new UserRolEntity(), userRolEntity)
        );
    }
}