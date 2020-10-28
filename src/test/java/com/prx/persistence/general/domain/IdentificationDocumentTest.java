package com.prx.persistence.general.domain;

import com.prx.commons.enums.types.IdentificationType;
import java.time.LocalDateTime;
import java.time.ZoneId;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * IdentificationDocumentTest.
 *
 * @author Luis Antonio Mata
 * @version 1.0.0, 22-10-2020
 */
class IdentificationDocumentTest {

    @Test
    void gettersAndSetters(){
        final var identificationDocument = new IdentificationDocument();

        identificationDocument.setId(1);
        identificationDocument.setNumber(114);
        identificationDocument.setPerson(new PersonEntity());
        identificationDocument.setExpirationDate(LocalDateTime.now(ZoneId.systemDefault()));
        identificationDocument.setIdentificationType(IdentificationType.PASSPORT);

        assertAll("Test Getters And Setters",
            () -> assertNotNull(identificationDocument.getId()),
            () -> assertNotNull(identificationDocument.toString()),
            () -> assertNotNull(identificationDocument.getPerson()),
            () -> assertNotNull(identificationDocument.getNumber()),
            () -> assertNotNull(identificationDocument.getExpirationDate()),
            () -> assertNotNull(identificationDocument.getIdentificationType()),
            () -> assertNotEquals(1, identificationDocument.hashCode()),
            () -> assertNotEquals(new IdentificationDocument(), identificationDocument)
                 );
    }

}