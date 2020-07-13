package com.prx.persistence.general.repository;

import com.prx.persistence.general.domain.PersonEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

/**
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 */
public interface PersonRepository extends PagingAndSortingRepository<PersonEntity, Long> {
    @Query("SELECT p FROM PersonEntity p WHERE p.name = :name AND p.middleName = :middleName AND p.lastName = :lastName")
    PersonEntity findByFirstNameMiddleNameLastName(@Param("name") String name, @Param("middleName") String middleName, @Param("lastName") String lastName);
}
