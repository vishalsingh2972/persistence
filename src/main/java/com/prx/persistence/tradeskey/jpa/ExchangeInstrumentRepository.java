/*
 *  @(#)ExchangeInstrumentRepository.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */

package com.prx.persistence.tradeskey.jpa;

import com.prx.persistence.tradeskey.domain.ExchangeInstrumentEntity;
import com.prx.persistence.tradeskey.domain.ExchangeInstrumentPK;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
public interface ExchangeInstrumentRepository extends PagingAndSortingRepository<ExchangeInstrumentEntity, ExchangeInstrumentPK> {

    @Query("SELECT e FROM ExchangeInstrumentEntity e WHERE e.exchange.id = :exchangeId")
    Optional<List<ExchangeInstrumentEntity>> findByIdExchange(@Param("exchangeId") Long exchangeId);
}
