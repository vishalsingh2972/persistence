package com.prx.persistence.general.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * AddressTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 21-10-2020
 */
class AddressTest {

    @Test
    void gettersAndSetters(){
        final var address = new Address();
        address.setId(1);
        address.setPerson(new PersonEntity());
        address.setZipcode("1010-9");
        address.setDescription("Descripcion de dirección");

        assertAll("Test Getters And Setters",
            () -> assertNotNull(address.getId()),
            () -> assertNotNull(address.getPerson()),
            () -> assertNotNull(address.getZipcode()),
            () -> assertNotNull(address.getDescription()),
            () -> assertNotNull(address.toString()),
            () -> assertNotEquals(1, address.hashCode()),
            () -> assertNotEquals(new Address(), address)
                 );
    }
    
}