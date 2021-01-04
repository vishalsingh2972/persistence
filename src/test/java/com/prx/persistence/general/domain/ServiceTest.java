package com.prx.persistence.general.domain;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * ServiceTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 22-10-2020
 */
class ServiceTest {

    @Test
    void gettersAndSetters(){
        final var service = new Service();

        service.setId(1);
        service.setName("Nombre de aplicación");
        service.setDescription("Descripción de servicio");
        service.setStatus(true);

        assertAll("Test Gettes and Setters",
            () -> assertNotNull(service.getId()),
            () -> assertNotNull(service.getName()),
            () -> assertNotNull(service.getDescription()),
            () -> assertNotNull(service.getStatus()),
            () -> assertNotNull(service.toString()),
            () -> assertNotEquals(1, service.hashCode()),
            () -> assertNotEquals(new Service(), service)
                 );
    }

}