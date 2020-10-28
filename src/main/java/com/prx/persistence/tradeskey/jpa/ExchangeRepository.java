/*
 *  @(#)ExchangeRepository.java
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

import com.prx.persistence.tradeskey.domain.ExchangeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
public interface ExchangeRepository extends PagingAndSortingRepository<ExchangeEntity, Long> {

}
