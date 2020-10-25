package com.prx.persistence.general.domain;

import com.prx.commons.enums.types.ContactType;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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

        contactEntity.setId(1);
        contactEntity.setActive(true);
        contactEntity.setPerson(new PersonEntity());
        contactEntity.setContent("Contenido");
        contactEntity.setContactType(ContactType.EMAIL);

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