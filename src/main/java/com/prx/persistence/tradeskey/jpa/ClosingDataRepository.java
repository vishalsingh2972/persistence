package com.prx.persistence.tradeskey.jpa;

import com.prx.persistence.tradeskey.domain.ClosingDataEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
public interface ClosingDataRepository extends PagingAndSortingRepository<ClosingDataEntity, Long> {

}
