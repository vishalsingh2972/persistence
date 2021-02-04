/*
 * @(#)TestContactTypeEntity.java.
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

/**
 * TestContactTypeEntity.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
class ContactTypeEntityTest {

    @Test
    void gettersAndSetters(){
        final var contactTypeEntity = new ContactTypeEntity();
        contactTypeEntity.setId(1);
        contactTypeEntity.setName("Tipo de contacto 0001");
        contactTypeEntity.setDescription("Descripción para tipo de contacto");
        contactTypeEntity.setStatus(true);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(contactTypeEntity.getId()),
            () -> assertNotNull(contactTypeEntity.getName()),
            () -> assertNotNull(contactTypeEntity.getDescription()),
            () -> assertNotNull(contactTypeEntity.toString()),
            ()-> assertNotNull(contactTypeEntity.getStatus()),
            () -> assertNotEquals(1, contactTypeEntity.hashCode()),
            () -> assertNotEquals(new ContactTypeEntity(), contactTypeEntity)
        );
    }

}