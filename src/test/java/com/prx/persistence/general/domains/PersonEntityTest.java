package com.prx.persistence.general.domains;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

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

        assertAll("Test Getters And Setters",
            ()-> assertNotNull(personEntity.getId()),
            ()-> assertNotNull(personEntity.getName()),
            ()-> assertNotNull(personEntity.getMiddleName()),
            ()-> assertNotNull(personEntity.getLastName()),
            ()-> assertNotNull(personEntity.getGender()),
            ()-> assertNotNull(personEntity.getBirthdate()),
            ()-> assertNotNull(personEntity.toString()),
            ()-> assertNotEquals(1, personEntity.hashCode()),
            ()-> assertNotEquals(new PersonEntity(), personEntity)
                 );

    }

}