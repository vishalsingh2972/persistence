package com.prx.persistence.general.domains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

/**
 * PersonEntityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 21-10-2020
 */
class PersonEntityTest {

    @Test
    void gettersAndSetters(){
        final var personEntity = new PersonEntity();

        personEntity.setId(1L);
        personEntity.setGender("M");
        personEntity.setName("Paco");
        personEntity.setMiddleName("Pepe");
        personEntity.setLastName("Pedroza");
        personEntity.setBirthdate(LocalDate.of(1979,4,14));

        Assertions.assertAll("Test Getters And Setters",
            ()-> Assertions.assertNotNull(personEntity.getId()),
            ()-> Assertions.assertNotNull(personEntity.getName()),
            ()-> Assertions.assertNotNull(personEntity.getMiddleName()),
            ()-> Assertions.assertNotNull(personEntity.getLastName()),
            ()-> Assertions.assertNotNull(personEntity.getGender()),
            ()-> Assertions.assertNotNull(personEntity.getBirthdate()),
            ()-> Assertions.assertNotNull(personEntity.toString()),
            ()-> Assertions.assertNotEquals(1, personEntity.hashCode()),
            ()-> Assertions.assertNotEquals(new PersonEntity(), personEntity)
                 );

    }

}