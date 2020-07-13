package com.prx.persistence.general.repository;

import com.prx.persistence.general.domain.Service;
import org.springframework.data.repository.CrudRepository;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
public interface ServiceRepository extends CrudRepository<Service, Long> {
}
