package com.prx.persistence.tradeskey.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * ExchangeInstrumentPKTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class ExchangeInstrumentPKTest {

    @Test
    void gettersAndSetters(){
        final var exchangeInstrumentPK = new ExchangeInstrumentPK();

        exchangeInstrumentPK.setExchange(new ExchangeEntity());
        exchangeInstrumentPK.setInstrument(new InstrumentEntity());

        assertAll("Test Getters And Setters",
            () -> assertNotNull(exchangeInstrumentPK.getExchange()),
            () -> assertNotNull(exchangeInstrumentPK.getInstrument()),
            () -> assertNotNull(exchangeInstrumentPK.toString()),
            () -> assertNotEquals(1, exchangeInstrumentPK.hashCode()),
            () -> assertNotEquals(new ExchangeInstrumentPK(), exchangeInstrumentPK)
                 );
    }

}