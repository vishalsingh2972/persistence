package com.prx.persistence.general.domains;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * ContactEntityTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 22-10-2020
 */
class ContactEntityTest {

    @Test
    void gettersAndSetters(){
        final var contactEntity = new ContactEntity();
        final var contactTypeEntity = new ContactTypeEntity();
        contactTypeEntity.setId(1);
        contactTypeEntity.setName("Tipo de contacto 0001");
        contactTypeEntity.setDescription("Descripción para tipo de contacto");
        contactTypeEntity.setStatus(true);

        contactEntity.setId(1);
        contactEntity.setActive(true);
        contactEntity.setPerson(new PersonEntity());
        contactEntity.setContent("Contenido");
        contactEntity.setContactType(contactTypeEntity);

        assertAll("Test Getters And Setters",
            ()-> assertNotNull(contactEntity.getId()),
            ()-> assertNotNull(contactEntity.getPerson()),
            ()-> assertNotNull(contactEntity.getActive()),
            ()-> assertNotNull(contactEntity.getContent()),
            ()-> assertNotNull(contactEntity.getContactType()),
            ()-> assertNotNull(contactEntity.toString()),
            ()-> assertNotEquals(1, contactEntity.hashCode()),
            ()-> assertNotEquals(new ContactEntity(), contactEntity)
                 );
    }

}