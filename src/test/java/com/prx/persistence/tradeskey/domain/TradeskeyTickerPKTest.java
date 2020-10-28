package com.prx.persistence.tradeskey.domain;

import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * TradeskeyTickerPKTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class TradeskeyTickerPKTest {

    @Test
    void gettersAndSetters(){
        final var tradeskeyTickerPK = new TradeskeyTickerPK();

        tradeskeyTickerPK.setIdExchange(14L);
        tradeskeyTickerPK.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));

        assertAll("Test Getters And Setters",
            () -> assertNotNull(tradeskeyTickerPK.getIdExchange()),
            () -> assertNotNull(tradeskeyTickerPK.getDateTime()),
            () -> assertNotNull(tradeskeyTickerPK.toString()),
            () -> assertNotEquals(1, tradeskeyTickerPK.hashCode()),
            () -> assertNotEquals(new TradeskeyTickerPK(), tradeskeyTickerPK)
                 );
    }

}