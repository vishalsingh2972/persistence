package com.prx.persistence.general.domains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

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
        userEntity.setAlias("Alias");
        userEntity.setActive(true);
        userEntity.setPassword("34567890");
        userEntity.setPerson(new PersonEntity());
        userEntity.setUserRole(new HashSet<>());

        Assertions.assertAll("Test Getters and Setters",
                () -> Assertions.assertNotNull(userEntity.getId()),
                () -> Assertions.assertNotNull(userEntity.toString()),
                () -> Assertions.assertNotNull(userEntity.getAlias()),
                () -> Assertions.assertNotNull(userEntity.getPerson()),
                () -> Assertions.assertNotNull(userEntity.getActive()),
                () -> Assertions.assertNotNull(userEntity.getUserRole()),
                () -> Assertions.assertNotNull(userEntity.getPassword()),
                () -> Assertions.assertNotEquals(1, userEntity.hashCode()),
                () -> Assertions.assertNotEquals(new UserEntity(), userEntity)
        );

    }

}
