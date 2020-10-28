package com.prx.persistence.general.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * ApplicationTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 22-10-2020
 */
class ApplicationTest {

    @Test
    void gettersAndSetters() {
        final var application = new Application();

        application.setActive(true);
        application.setDescription("Descripción de aplicación");
        application.setId(1);
        application.setTitle("Titulo de aplicación");

        assertAll("Test Getters And Setters",
            () -> assertNotNull(application.getActive()),
            () -> assertNotNull(application.getDescription()),
            () -> assertNotNull(application.getId()),
            () -> assertNotNull(application.getTitle()),
            () -> assertNotNull(application.toString()),
            () -> assertNotEquals(1, application.hashCode()),
            () -> assertNotEquals(new Application(), application)
                 );
    }

}