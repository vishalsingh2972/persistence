package com.prx.persistence.tradeskey.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * ActiveTypeEntityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 23-10-2020
 */
class ActiveTypeEntityTest {

    @Test
    void gettersAndSetters(){
        final var activeTypeEntity = new ActiveTypeEntity();

        activeTypeEntity.setId(1);
        activeTypeEntity.setActive(true);
        activeTypeEntity.setDescription("Descripción para el tipo nde actividad");
        activeTypeEntity.setName("Nombre del tipo de actividad");

        assertAll("Test Getters and Setters",
            () -> assertNotNull(activeTypeEntity.getId()),
            () -> assertNotNull(activeTypeEntity.getName()),
            () -> assertNotNull(activeTypeEntity.getActive()),
            () -> assertNotNull(activeTypeEntity.getDescription()),
            () -> assertNotNull(activeTypeEntity.toString()),
            () -> assertNotEquals(1, activeTypeEntity.hashCode()),
            () -> assertNotEquals(new ActiveTypeEntity(), activeTypeEntity)
                 );
    }

}