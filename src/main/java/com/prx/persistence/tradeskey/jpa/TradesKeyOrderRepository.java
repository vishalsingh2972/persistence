package com.prx.persistence.tradeskey.jpa;

import com.prx.persistence.tradeskey.domain.TradeskeyOrder;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TradesKeyOrderRepository extends PagingAndSortingRepository<TradeskeyOrder, Long> {
}
