package com.prx.persistence.general.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * UserEntityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 22-10-2020
 */
class UserEntityTest {

    @Test
    void gettersAndSetters() {
        final var userEntity = new UserEntity();

        userEntity.setId(3L);
        userEntity.setAlias("Alias de usuario");
        userEntity.setActive(true);
        userEntity.setPassword("34567890");
        userEntity.setPerson(new PersonEntity());

        assertAll("Test Getters and Setters",
            () -> assertNotNull(userEntity.getId()),
            () -> assertNotNull(userEntity.getAlias()),
            () -> assertNotNull(userEntity.getPerson()),
            () -> assertNotNull(userEntity.getActive()),
            () -> assertNotNull(userEntity.getPassword()),
            () -> assertNotNull(userEntity.toString()),
            () -> assertNotEquals(1, userEntity.hashCode()),
            () -> assertNotEquals(new UserEntity(), userEntity)
                 );

    }

}