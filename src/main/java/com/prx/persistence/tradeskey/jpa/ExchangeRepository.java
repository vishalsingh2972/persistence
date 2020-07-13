package com.prx.persistence.tradeskey.jpa;

import com.prx.persistence.tradeskey.domain.ExchangeEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Luis A. Mata <luis.antonio.mata@gmail.com>
 */
public interface ExchangeRepository extends PagingAndSortingRepository<ExchangeEntity, Long> {

}
