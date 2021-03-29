package com.prx.persistence.general.domains;

import com.prx.commons.enums.types.IdentificationType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * IdentificationDocumentTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 22-10-2020
 */
class IdentificationDocumentEntityTest {

    @Test
    void gettersAndSetters(){
        final var identificationDocument = new IdentificationDocumentEntity();

        identificationDocument.setId(1);
        identificationDocument.setNumber(114);
        identificationDocument.setPerson(new PersonEntity());
        identificationDocument.setExpirationDate(LocalDateTime.now(ZoneId.systemDefault()));
        identificationDocument.setIdentificationType(IdentificationType.PASSPORT);

        Assertions.assertAll("Test Getters And Setters",
            () -> Assertions.assertNotNull(identificationDocument.getId()),
            () -> Assertions.assertNotNull(identificationDocument.toString()),
            () -> Assertions.assertNotNull(identificationDocument.getPerson()),
            () -> Assertions.assertNotNull(identificationDocument.getNumber()),
            () -> Assertions.assertNotNull(identificationDocument.getExpirationDate()),
            () -> Assertions.assertNotNull(identificationDocument.getIdentificationType()),
            () -> Assertions.assertNotEquals(1, identificationDocument.hashCode()),
            () -> Assertions.assertNotEquals(new IdentificationDocumentEntity(), identificationDocument)
                 );
    }

}