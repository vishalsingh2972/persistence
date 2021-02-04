package com.prx.persistence.general.domains;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * AddressTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 21-10-2020
 */
class AddressEntityTest {

    @Test
    void gettersAndSetters(){
        final var address = new AddressEntity();
        address.setId(1);
        address.setPerson(new PersonEntity());
        address.setZipcode("1010-9");
        address.setDescription("Descripción de dirección");

        assertAll("Test Getters And Setters",
            () -> assertNotNull(address.getId()),
            () -> assertNotNull(address.getPerson()),
            () -> assertNotNull(address.getZipcode()),
            () -> assertNotNull(address.getDescription()),
            () -> assertNotNull(address.toString()),
            () -> assertNotEquals(1, address.hashCode()),
            () -> assertNotEquals(new AddressEntity(), address)
                 );
    }
    
}