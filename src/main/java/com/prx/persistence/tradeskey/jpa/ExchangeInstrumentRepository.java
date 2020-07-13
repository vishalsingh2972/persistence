package com.prx.persistence.tradeskey.jpa;

import com.prx.persistence.tradeskey.domain.ExchangeEntity;
import com.prx.persistence.tradeskey.domain.ExchangeInstrumentEntity;
import com.prx.persistence.tradeskey.domain.ExchangeInstrumentPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
public interface ExchangeInstrumentRepository extends PagingAndSortingRepository<ExchangeInstrumentEntity, ExchangeInstrumentPK> {

    @Query("SELECT e FROM ExchangeInstrumentEntity e WHERE e.exchange.id = :exchangeId")
    Optional<List<ExchangeInstrumentEntity>> findByIdExchange(@Param("exchangeId") Long exchangeId);
}
