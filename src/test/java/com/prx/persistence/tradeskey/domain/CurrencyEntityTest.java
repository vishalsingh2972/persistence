package com.prx.persistence.tradeskey.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * CurrencyEntityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 25-10-2020
 */
class CurrencyEntityTest {

    @Test
    void gettersAndSetters(){
        final var currencyEntity = new CurrencyEntity();

        currencyEntity.setActive(true);
        currencyEntity.setActiveType(new ActiveTypeEntity());
        currencyEntity.setId(1);
        currencyEntity.setName("Nombre de moneda");
        currencyEntity.setSymbol("Simbolo de moneda");

        assertAll("Test Getters And Setters",
            ()-> assertNotNull(currencyEntity.getId()),
            ()-> assertNotNull(currencyEntity.getActive()),
            ()-> assertNotNull(currencyEntity.getActiveType()),
            ()-> assertNotNull(currencyEntity.getName()),
            ()-> assertNotNull(currencyEntity.getSymbol()),
            ()-> assertNotNull(currencyEntity.toString()),
            ()-> assertNotEquals(1, currencyEntity.hashCode()),
            ()-> assertNotEquals(new CurrencyEntity(), currencyEntity)
                 );
    }

}