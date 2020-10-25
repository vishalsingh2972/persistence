package com.prx.persistence.tradeskey.domain;

import com.prx.commons.pojo.Person;
import java.util.HashSet;
import java.util.TimeZone;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * ExchangeEntityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class ExchangeEntityTest {

    @Test
    void testHashCode(){
        final var exchangeEntityA = new ExchangeEntity();
        final var exchangeEntityB = new ExchangeEntity();

        exchangeEntityA.setId(1L);
        exchangeEntityA.setName("Exchange A");
        exchangeEntityA.setActive(true);
        exchangeEntityA.setTimeZone(TimeZone.getDefault().toZoneId().getId());
        exchangeEntityA.setDescription("Descripción de exchange");
        exchangeEntityA.setInstruments(new HashSet<>());
        exchangeEntityA.setHeadquarters("Central 001");

        exchangeEntityB.setId(2L);
        exchangeEntityB.setName(null);
        exchangeEntityB.setActive(true);
        exchangeEntityB.setTimeZone(TimeZone.getDefault().toZoneId().getId());
        exchangeEntityB.setDescription("Descripción de exchange");
        exchangeEntityB.setInstruments(new HashSet<>());
        exchangeEntityB.setHeadquarters("Central 001");


        assertNotEquals(1, exchangeEntityA.hashCode());
        assertEquals(0, exchangeEntityB.hashCode());
    }

    @Test
    void testEquals() {
        final var exchangeEntityA = new ExchangeEntity();
        final var exchangeEntityB = new ExchangeEntity();
        final var exchangeEntityC = new ExchangeEntity();

        exchangeEntityA.setId(1L);
        exchangeEntityA.setName("Exchange A");
        exchangeEntityA.setActive(true);
        exchangeEntityA.setTimeZone(TimeZone.getDefault().toZoneId().getId());
        exchangeEntityA.setDescription("Descripción de exchange");
        exchangeEntityA.setInstruments(new HashSet<>());
        exchangeEntityA.setHeadquarters("Central 001");

        exchangeEntityB.setId(2L);
        exchangeEntityB.setName("Exchange B");
        exchangeEntityB.setActive(true);
        exchangeEntityB.setTimeZone(TimeZone.getDefault().toZoneId().getId());
        exchangeEntityB.setDescription("Descripción de exchange");
        exchangeEntityB.setInstruments(new HashSet<>());
        exchangeEntityB.setHeadquarters("Central 001");

        exchangeEntityC.setId(1L);
        exchangeEntityC.setName("Exchange A");
        exchangeEntityC.setActive(true);
        exchangeEntityC.setTimeZone(TimeZone.getDefault().toZoneId().getId());
        exchangeEntityC.setDescription("Descripción de exchange");
        exchangeEntityC.setInstruments(new HashSet<>());
        exchangeEntityC.setHeadquarters("Central 001");

        assertNotEquals(exchangeEntityB, exchangeEntityA);
        assertNotEquals(exchangeEntityB, null);
        assertNotEquals(exchangeEntityB, new Person());
        assertEquals(exchangeEntityA, exchangeEntityA);
        assertEquals(exchangeEntityA, exchangeEntityC);
    }

    @Test
    void gettersAndSetters() {
        final var exchangeEntity = new ExchangeEntity();

        exchangeEntity.setId(1L);
        exchangeEntity.setName("Exchange");
        exchangeEntity.setActive(true);
        exchangeEntity.setTimeZone(TimeZone.getDefault().toZoneId().getId());
        exchangeEntity.setDescription("Descripción de exchange");
        exchangeEntity.setInstruments(new HashSet<>());
        exchangeEntity.setHeadquarters("Central 001");

        assertAll("Test Getters and Setters",
            () -> assertNotNull(exchangeEntity.getId()),
            () -> assertNotNull(exchangeEntity.getName()),
            () -> assertNotNull(exchangeEntity.getActive()),
            () -> assertNotNull(exchangeEntity.getTimeZone()),
            () -> assertNotNull(exchangeEntity.getDescription()),
            () -> assertNotNull(exchangeEntity.getInstruments()),
            () -> assertNotNull(exchangeEntity.getHeadquarters()),
            () -> assertNotNull(exchangeEntity.toString()),
            () -> assertNotEquals(1, exchangeEntity.hashCode()),
            () -> assertEquals(exchangeEntity.hashCode(), exchangeEntity.hashCode()),
            () -> assertNotEquals(new ExchangeEntity(), exchangeEntity)
                 );
    }

}