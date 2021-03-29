package com.prx.persistence.general.domains;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ServiceTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 22-10-2020
 */
class ServiceEntityTest {

    @Test
    void gettersAndSetters(){
        final var service = new ServiceEntity();

        service.setId(1);
        service.setName("Nombre de aplicación");
        service.setDescription("Descripción de servicio");
        service.setActive(true);

        Assertions.assertAll("Test Getters and Setters",
            () -> Assertions.assertNotNull(service.getId()),
            () -> Assertions.assertNotNull(service.getName()),
            () -> Assertions.assertNotNull(service.getDescription()),
            () -> Assertions.assertTrue(service.isActive()),
            () -> Assertions.assertNotNull(service.toString()),
            () -> Assertions.assertNotEquals(1, service.hashCode()),
            () -> Assertions.assertNotEquals(new ServiceEntity(), service)
                 );
    }

}