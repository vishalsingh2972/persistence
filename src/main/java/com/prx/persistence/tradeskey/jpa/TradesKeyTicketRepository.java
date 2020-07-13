package com.prx.persistence.tradeskey.jpa;

import com.prx.persistence.tradeskey.domain.TradeskeyTicker;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Luis Antonio Mata <luis.antonio.mata@gmail.com>
 */
public interface TradesKeyTicketRepository extends PagingAndSortingRepository<TradeskeyTicker, Long> {

}
