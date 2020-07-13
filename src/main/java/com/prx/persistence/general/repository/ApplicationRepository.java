package com.prx.persistence.general.repository;

import com.prx.persistence.general.domain.Address;
import org.springframework.data.repository.CrudRepository;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
public interface ApplicationRepository extends CrudRepository<Address, Long> {
}
