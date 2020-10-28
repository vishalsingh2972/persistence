package com.prx.persistence.tradeskey.domain;

import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * DataValueTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class DataValueTest {

    @Test
    void gettersAndSetters(){
        final var dataValue = new DataValue();

        dataValue.setId(11447L);
        dataValue.setAsk(452.58D);
        dataValue.setBid(326.27D);
        dataValue.setLast(745.58D);
        dataValue.setVolume(7896.00D);
        dataValue.setExchangeId(new ExchangeEntity());
        dataValue.setDateTime(LocalDateTime.now(ZoneId.systemDefault()));
        dataValue.setInstrumentEntity(new InstrumentEntity());


        assertAll("Test Getters And Setters",
            () -> assertNotNull(dataValue.getId()),
            () -> assertNotNull(dataValue.getAsk()),
            () -> assertNotNull(dataValue.getBid()),
            () -> assertNotNull(dataValue.getLast()),
            () -> assertNotNull(dataValue.getVolume()),
            () -> assertNotNull(dataValue.getExchangeId()),
            () -> assertNotNull(dataValue.getDateTime()),
            () -> assertNotNull(dataValue.getInstrumentEntity()),
            () -> assertNotNull(dataValue.toString()),
            () -> assertNotEquals(1, dataValue.hashCode()),
            () -> assertNotEquals(new DataValue(), dataValue)
                 );
    }

}