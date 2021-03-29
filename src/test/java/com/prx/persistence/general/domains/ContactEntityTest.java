package com.prx.persistence.general.domains;

import org.junit.jupiter.api.Assertions;
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
        contactTypeEntity.setActive(true);

        contactEntity.setId(1);
        contactEntity.setActive(true);
        contactEntity.setPerson(new PersonEntity());
        contactEntity.setContent("Contenido");
        contactEntity.setContactType(contactTypeEntity);

        Assertions.assertAll("Test Getters And Setters",
            ()-> Assertions.assertNotNull(contactEntity.getId()),
            ()-> Assertions.assertNotNull(contactEntity.getPerson()),
            ()-> Assertions.assertNotNull(contactEntity.getActive()),
            ()-> Assertions.assertNotNull(contactEntity.getContent()),
            ()-> Assertions.assertNotNull(contactEntity.getContactType()),
            ()-> Assertions.assertNotNull(contactEntity.toString()),
            ()-> Assertions.assertNotEquals(1, contactEntity.hashCode()),
            ()-> Assertions.assertNotEquals(new ContactEntity(), contactEntity)
                 );
    }

}