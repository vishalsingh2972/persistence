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

import static org.junit.jupiter.api.Assertions.*;
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
        final var rolFeatures = new HashSet<RolFeatureEntity>();

        featureEntity.setId(1L);
        featureEntity.setStatus(true);
        featureEntity.setName("Nombre de característica");
        featureEntity.setDescription("Descripción de característica");
        featureEntity.setRolFeatures(rolFeatures);

        assertAll("Test Getters And Setters",
            ()-> assertNotNull(featureEntity.getId()),
            ()-> assertNotNull(featureEntity.getName()),
            ()-> assertNotNull(featureEntity.toString()),
            ()-> assertNotNull(featureEntity.getStatus()),
            ()-> assertNotNull(featureEntity.getDescription()),
            ()-> assertNotNull(featureEntity.getRolFeatures()),
            ()-> assertNotEquals(1, featureEntity.hashCode()),
            ()-> assertNotEquals(new FeatureEntity(), featureEntity)
        );
    }
}