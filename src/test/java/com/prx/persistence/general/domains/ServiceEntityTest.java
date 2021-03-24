package com.prx.persistence.general.domains;

import static org.junit.jupiter.api.Assertions.*;
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

        assertAll("Test Getters and Setters",
            () -> assertNotNull(service.getId()),
            () -> assertNotNull(service.getName()),
            () -> assertNotNull(service.getDescription()),
            () -> assertTrue(service.isActive()),
            () -> assertNotNull(service.toString()),
            () -> assertNotEquals(1, service.hashCode()),
            () -> assertNotEquals(new ServiceEntity(), service)
                 );
    }

}