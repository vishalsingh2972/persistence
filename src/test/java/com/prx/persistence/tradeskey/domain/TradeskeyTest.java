package com.prx.persistence.tradeskey.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * TradeskeyTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class TradeskeyTest {

    @Test
    void gettersAndSetters(){
        final var tradeskey = new Tradeskey();

        tradeskey.setId(12L);
        tradeskey.setType(2);
        tradeskey.setPrice(258.36D);
        tradeskey.setAmount(2000.2D);
        tradeskey.setTimestamp(System.currentTimeMillis());
        tradeskey.setExchangeId(1);
        tradeskey.setBuyOrderId(225);
        tradeskey.setSellOrderId(336);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(tradeskey.getId()),
            () -> assertNotNull(tradeskey.getType()),
            () -> assertNotNull(tradeskey.getPrice()),
            () -> assertNotNull(tradeskey.getAmount()),
            () -> assertNotNull(tradeskey.getTimestamp()),
            () -> assertNotNull(tradeskey.getExchangeId()),
            () -> assertNotNull(tradeskey.getBuyOrderId()),
            () -> assertNotNull(tradeskey.getSellOrderId()),
            () -> assertNotNull(tradeskey.toString()),
            () -> assertNotEquals(1, tradeskey.hashCode()),
            () -> assertNotEquals(new Tradeskey(), tradeskey)
                 );
    }

}