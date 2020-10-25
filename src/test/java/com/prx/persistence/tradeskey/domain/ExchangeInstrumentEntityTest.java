package com.prx.persistence.tradeskey.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * ExchangeInstrumentEntityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class ExchangeInstrumentEntityTest {

    @Test
    void gettersAndSetters(){
        final var exchangeInstrumentEntity = new ExchangeInstrumentEntity();

        exchangeInstrumentEntity.setActive(true);
        exchangeInstrumentEntity.setIdentifier("00002A");
        exchangeInstrumentEntity.setExchange(new ExchangeEntity());
        exchangeInstrumentEntity.setInstrument(new InstrumentEntity());

        assertAll("Test Getters And Setters",
            () -> assertNotNull(exchangeInstrumentEntity.getActive()),
            () -> assertNotNull(exchangeInstrumentEntity.getIdentifier()),
            () -> assertNotNull(exchangeInstrumentEntity.getExchange()),
            () -> assertNotNull(exchangeInstrumentEntity.getInstrument()),
            () -> assertNotNull(exchangeInstrumentEntity.toString()),
            () -> assertNotEquals(1, exchangeInstrumentEntity.hashCode()),
            () -> assertNotEquals(new ExchangeInstrumentEntity(), exchangeInstrumentEntity)
                 );
    }

}