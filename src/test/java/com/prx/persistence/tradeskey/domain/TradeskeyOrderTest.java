package com.prx.persistence.tradeskey.domain;

import com.prx.commons.enums.types.CriptocurrencyType;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * TradeskeyOrderTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class TradeskeyOrderTest {

    @Test
    void gettersAndSetters(){
        final var tradeskeyOrder = new TradeskeyOrder();

        tradeskeyOrder.setId(12L);
        tradeskeyOrder.setType(2);
        tradeskeyOrder.setPrice(258.36D);
        tradeskeyOrder.setAmount(2000.2D);
        tradeskeyOrder.setTimestamp(System.currentTimeMillis());
        tradeskeyOrder.setExchangeId(1);
        tradeskeyOrder.setBuyOrderId(225);
        tradeskeyOrder.setSellOrderId(336);
        tradeskeyOrder.setCriptocurrencyType(CriptocurrencyType.BITCOIN);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(tradeskeyOrder.getId()),
            () -> assertNotNull(tradeskeyOrder.getType()),
            () -> assertNotNull(tradeskeyOrder.getPrice()),
            () -> assertNotNull(tradeskeyOrder.getAmount()),
            () -> assertNotNull(tradeskeyOrder.getTimestamp()),
            () -> assertNotNull(tradeskeyOrder.getExchangeId()),
            () -> assertNotNull(tradeskeyOrder.getBuyOrderId()),
            () -> assertNotNull(tradeskeyOrder.getSellOrderId()),
            () -> assertNotNull(tradeskeyOrder.getCriptocurrencyType()),
            () -> assertNotNull(tradeskeyOrder.toString()),
            () -> assertNotEquals(1, tradeskeyOrder.hashCode()),
            () -> assertNotEquals(new TradeskeyOrder(), tradeskeyOrder)
                 );
    }

}