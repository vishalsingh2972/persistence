/*
 * @(#)FeatureEntityTest.java.
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
 * FeatureEntityTest.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
class FeatureEntityTest {
    @Test
    void gettersAndSetters(){
        final var featureEntity = new FeatureEntity();
        final var rolFeatures = new HashSet<RoleFeatureEntity>();

        featureEntity.setId(1L);
        featureEntity.setActive(true);
        featureEntity.setName("Feature name");
        featureEntity.setDescription("Feature description");
        featureEntity.setRolFeatures(rolFeatures);

        Assertions.assertAll("Test Getters And Setters",
            ()-> Assertions.assertNotNull(featureEntity.getId()),
            ()-> Assertions.assertNotNull(featureEntity.getName()),
            ()-> Assertions.assertNotNull(featureEntity.toString()),
            ()-> Assertions.assertNotNull(featureEntity.getActive()),
            ()-> Assertions.assertNotNull(featureEntity.getDescription()),
            ()-> Assertions.assertNotNull(featureEntity.getRolFeatures()),
            ()-> Assertions.assertNotEquals(1, featureEntity.hashCode()),
            ()-> Assertions.assertNotEquals(new FeatureEntity(), featureEntity)
        );
    }
}
