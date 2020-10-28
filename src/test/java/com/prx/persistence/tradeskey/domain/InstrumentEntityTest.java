package com.prx.persistence.tradeskey.domain;

import com.prx.commons.pojo.Person;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * InstrumentEntityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class InstrumentEntityTest {

    @Test
    void testHashCode(){
        final var instrumentEntity = new InstrumentEntity();
        final var instrumentEntityB = new InstrumentEntity();

        instrumentEntity.setId(145L);
        instrumentEntity.setActive(true);
        instrumentEntity.setExchanges(new HashSet<>());
        instrumentEntity.setName("Nombre de exchange");
        instrumentEntity.setCurrencySource(new CurrencyEntity());
        instrumentEntity.setCurrencyTarget(new CurrencyEntity());
        instrumentEntity.setDescription("Descripción de instrumento");

        instrumentEntity.setId(145L);
        instrumentEntity.setActive(true);
        instrumentEntity.setExchanges(new HashSet<>());
        instrumentEntity.setName(null);
        instrumentEntity.setCurrencySource(new CurrencyEntity());
        instrumentEntity.setCurrencyTarget(new CurrencyEntity());
        instrumentEntity.setDescription("Descripción de instrumento");

        assertNotEquals(1, instrumentEntity.hashCode());
        assertEquals(0, instrumentEntityB.hashCode());
    }

    @Test
    void testEquals() {
        final var instrumentEntity = new InstrumentEntity();
        final var instrumentEntityB = new InstrumentEntity();
        final var instrumentEntityC = new InstrumentEntity();

        instrumentEntity.setId(145L);
        instrumentEntity.setActive(true);
        instrumentEntity.setExchanges(new HashSet<>());
        instrumentEntity.setName("Nombre de exchange");
        instrumentEntity.setCurrencySource(new CurrencyEntity());
        instrumentEntity.setCurrencyTarget(new CurrencyEntity());
        instrumentEntity.setDescription("Descripción de instrumento");

        instrumentEntityB.setId(205L);
        instrumentEntityB.setActive(true);
        instrumentEntityB.setExchanges(new HashSet<>());
        instrumentEntityB.setName("Nombre de otro exchange");
        instrumentEntityB.setCurrencySource(new CurrencyEntity());
        instrumentEntityB.setCurrencyTarget(new CurrencyEntity());
        instrumentEntityB.setDescription("Descripción de otro instrumento");

        instrumentEntityC.setId(145L);
        instrumentEntityC.setActive(false);
        instrumentEntityC.setExchanges(new HashSet<>());
        instrumentEntityC.setName("Nombre de exchange");
        instrumentEntityC.setCurrencySource(new CurrencyEntity());
        instrumentEntityC.setCurrencyTarget(new CurrencyEntity());
        instrumentEntityC.setDescription("Descripción de otro instrumento");

        assertNotEquals(instrumentEntityB, instrumentEntity);
        assertNotEquals(instrumentEntityB, null);
        assertNotEquals(instrumentEntityB, new Person());
        assertEquals(instrumentEntity, instrumentEntity);
        assertEquals(instrumentEntity, instrumentEntityC);

    }

    @Test
    void gettersAndSetters(){
        final var instrumentEntity = new InstrumentEntity();

        instrumentEntity.setId(145L);
        instrumentEntity.setActive(true);
        instrumentEntity.setExchanges(new HashSet<>());
        instrumentEntity.setName("Nombre de exchange");
        instrumentEntity.setCurrencySource(new CurrencyEntity());
        instrumentEntity.setCurrencyTarget(new CurrencyEntity());
        instrumentEntity.setDescription("Descripción de instrumento");

        assertAll("Test Getters and Setters",
            () -> assertNotNull(instrumentEntity.getActive()),
            () -> assertNotNull(instrumentEntity.getCurrencySource()),
            () -> assertNotNull(instrumentEntity.getCurrencyTarget()),
            () -> assertNotNull(instrumentEntity.getDescription()),
            () -> assertNotNull(instrumentEntity.getExchanges()),
            () -> assertNotNull(instrumentEntity.getId()),
            () -> assertNotNull(instrumentEntity.getName()),
            () -> assertNotNull(instrumentEntity.toString()),
            () -> assertNotEquals(1, instrumentEntity.hashCode()),
            () -> assertNotEquals(new InstrumentEntity(), instrumentEntity)
                 );
    }

}