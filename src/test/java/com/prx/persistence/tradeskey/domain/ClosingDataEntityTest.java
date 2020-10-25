package com.prx.persistence.tradeskey.domain;

import java.time.Clock;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * ClosingDataEntityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 23-10-2020
 */
class ClosingDataEntityTest {

    @Test
    void gettersAndSetters() {
        final var closingDataEntity = new ClosingDataEntity();

        closingDataEntity.setAsk(1002.36D);
        closingDataEntity.setBid(1522.36D);
        closingDataEntity.setClose(12336.36);
        closingDataEntity.setExchangeId(new ExchangeEntity());
        closingDataEntity.setHigh(10236.32D);
        closingDataEntity.setId(1L);
        closingDataEntity.setInstrument(new InstrumentEntity());
        closingDataEntity.setLast(2536.25);
        closingDataEntity.setDateTime(LocalDateTime.now(Clock.systemDefaultZone()));
        closingDataEntity.setLow(25236.36d);
        closingDataEntity.setOpen(25236.36d);
        closingDataEntity.setVolume(555.36d);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(closingDataEntity.getAsk()),
            () -> assertNotNull(closingDataEntity.getBid()),
            () -> assertNotNull(closingDataEntity.getClose()),
            () -> assertNotNull(closingDataEntity.getExchangeId()),
            () -> assertNotNull(closingDataEntity.getHigh()),
            () -> assertNotNull(closingDataEntity.getId()),
            () -> assertNotNull(closingDataEntity.getInstrument()),
            () -> assertNotNull(closingDataEntity.getLast()),
            () -> assertNotNull(closingDataEntity.getDateTime()),
            () -> assertNotNull(closingDataEntity.getLow()),
            () -> assertNotNull(closingDataEntity.getOpen()),
            () -> assertNotNull(closingDataEntity.getVolume()),
            () -> assertNotNull(closingDataEntity.toString()),
            () -> assertNotEquals(1, closingDataEntity.hashCode()),
            () -> assertNotEquals(new ClosingDataEntity(), closingDataEntity)
                 );
    }

}