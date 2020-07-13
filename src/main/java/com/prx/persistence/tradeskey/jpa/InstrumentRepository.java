package com.prx.persistence.tradeskey.jpa;

import com.prx.persistence.tradeskey.domain.InstrumentEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Interfaz de tipo repositorio para gestion de datos pertenecientes a la entidad
 * Instrument
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
public interface InstrumentRepository extends PagingAndSortingRepository<InstrumentEntity, Long> {

}
