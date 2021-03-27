/*
 * @(#)RolFeaturePKTest.java.
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
 * RolFeaturePKTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
public class RolFeaturePKTest {

    @Test
    public void gettersAndSetters() {
        final var rolFeaturePk = new RolFeaturePK();
        final var rolEntity = new RolEntity();
        final var features = new HashSet<RolFeatureEntity>();
        final var users = new HashSet<UserRolEntity>();
        final var featureEntity = new FeatureEntity();

        final var rolFeaturePk2 = new RolFeaturePK();
        final var rolEntity2 = new RolEntity();
        final var features2 = new HashSet<RolFeatureEntity>();
        final var users2 = new HashSet<UserRolEntity>();
        final var featureEntity2 = new FeatureEntity();

        featureEntity.setId(1L);
        featureEntity.setActive(true);
        featureEntity.setName("Nombre de característica");
        featureEntity.setDescription("Descripción de característica");
        featureEntity.setRolFeatures(features);

        rolEntity.setId(3);
        rolEntity.setName("Rol 0001");
        rolEntity.setDescription("Descripción del rol");
        rolEntity.setActive(true);
        rolEntity.setRolFeatures(features);
        rolEntity.setUserRolEntities(users);

        rolFeaturePk.setFeature(featureEntity);
        rolFeaturePk.setRol(rolEntity);

        featureEntity2.setId(1L);
        featureEntity2.setActive(true);
        featureEntity2.setName("Nombre de característica 2");
        featureEntity2.setDescription("Descripción de característica 2");
        featureEntity2.setRolFeatures(features);

        rolEntity2.setId(3);
        rolEntity2.setName("Rol 0002");
        rolEntity2.setDescription("Descripción del rol 2");
        rolEntity2.setActive(true);
        rolEntity2.setRolFeatures(features);
        rolEntity2.setUserRolEntities(users);

        rolFeaturePk2.setFeature(featureEntity2);
        rolFeaturePk2.setRol(rolEntity2
        );

        Assertions.assertAll("Test Getters and Setters",
            () -> Assertions.assertNotNull(rolFeaturePk.getRol()),
            () -> Assertions.assertNotNull(rolFeaturePk.getFeature()),
            () -> Assertions.assertNotNull(rolFeaturePk.toString()),
            () -> Assertions.assertNotEquals(1, rolFeaturePk.hashCode()),
            () -> Assertions.assertEquals(rolFeaturePk, rolFeaturePk),
            () -> Assertions.assertNotEquals(rolFeaturePk2, rolFeaturePk)
        );
    }

}