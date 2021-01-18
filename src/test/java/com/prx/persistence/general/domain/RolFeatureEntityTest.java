/*
 * @(#)RolFeatureEntityTest.java.
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

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

/**
 * RolFeatureEntityTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
class RolFeatureEntityTest {
    @Test
    void gettersAndSetters(){
        final var rolFeatures = new RolFeatureEntity();
        final var featureEntity = new FeatureEntity();
        final var rolEntity = new RolEntity();
        final var features = new HashSet<RolFeatureEntity>();
        final var users = new HashSet<UserRolEntity>();

        rolEntity.setId(3);
        rolEntity.setName("Rol 0001");
        rolEntity.setDescription("Descripción del rol");
        rolEntity.setStatus(true);
        rolEntity.setRolFeatures(features);
        rolEntity.setUserRoles(users);
        featureEntity.setId(1L);
        featureEntity.setStatus(true);
        featureEntity.setName("Nombre de característica");
        featureEntity.setDescription("Descripción de característica");

        rolFeatures.setFeature(featureEntity);
        rolFeatures.setRol(rolEntity);
        rolFeatures.setStatus(true);

        assertAll("Test Getters and Setters",
            () -> assertNotNull(rolFeatures.getRol()),
            () -> assertNotNull(rolFeatures.getFeature()),
            () -> assertNotNull(rolFeatures.getStatus()),
            () -> assertNotNull(rolFeatures.toString()),
            () -> assertNotEquals(1, rolFeatures.hashCode()),
            () -> assertNotEquals(new RolFeatureEntity(), rolFeatures)
        );
    }
}