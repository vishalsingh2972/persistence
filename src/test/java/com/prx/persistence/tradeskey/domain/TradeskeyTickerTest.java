package com.prx.persistence.tradeskey.domain;

import com.prx.commons.enums.types.CriptocurrencyType;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * TradeskeyTickerTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class TradeskeyTickerTest {

    @Test
    void gettersAndSetters(){
        final var tradeskeyTicker = new TradeskeyTicker();

        tradeskeyTicker.setAsk(1456.58D);
        tradeskeyTicker.setAskSize(7879.36D);
        tradeskeyTicker.setBid(456.36D);
        tradeskeyTicker.setBidSize(7859.69D);
        tradeskeyTicker.setCriptocurrencyTypeSource(CriptocurrencyType.BITCOIN);
        tradeskeyTicker.setCriptocurrencyTypeTarget(CriptocurrencyType.CARDANO);
        tradeskeyTicker.setDailyChange(58.47D);
        tradeskeyTicker.setDailyChangePerc(52.8D);
        tradeskeyTicker.setHigh(7482.01D);
        tradeskeyTicker.setIdExchange(1);
        tradeskeyTicker.setLastPrice(785.36D);
        tradeskeyTicker.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));
        tradeskeyTicker.setLow(458.36d);
        tradeskeyTicker.setParity("BTC/CLP");
        tradeskeyTicker.setVolume(2536.369D);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(tradeskeyTicker.getBid()),
            () -> assertNotNull(tradeskeyTicker.getAsk()),
            () -> assertNotNull(tradeskeyTicker.getLow()),
            () -> assertNotNull(tradeskeyTicker.getHigh()),
            () -> assertNotNull(tradeskeyTicker.getParity()),
            () -> assertNotNull(tradeskeyTicker.getVolume()),
            () -> assertNotNull(tradeskeyTicker.getAskSize()),
            () -> assertNotNull(tradeskeyTicker.getBidSize()),
            () -> assertNotNull(tradeskeyTicker.getLastPrice()),
            () -> assertNotNull(tradeskeyTicker.getIdExchange()),
            () -> assertNotNull(tradeskeyTicker.getDailyChange()),
            () -> assertNotNull(tradeskeyTicker.getDateTime()),
            () -> assertNotNull(tradeskeyTicker.getDailyChangePerc()),
            () -> assertNotNull(tradeskeyTicker.getCriptocurrencyTypeSource()),
            () -> assertNotNull(tradeskeyTicker.getCriptocurrencyTypeTarget()),
            () -> assertNotNull(tradeskeyTicker.toString()),
            () -> assertNotEquals(1, tradeskeyTicker.hashCode()),
            () -> assertNotEquals(new TradeskeyTicker(), tradeskeyTicker)
                 );
    }

}