/*
 * @(#)RolRepository.java.
 *
 * Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 * All rights to this product are owned by Luis Antonio Mata Mata and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by Luis Antonio Mata Mata.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package com.prx.persistence.general.repositories;

import com.prx.persistence.general.domains.RolEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * RolRepository.
 *
 * @author <a href='mailto:luis.antonio.mata@gmail.com'>Luis Antonio Mata.</a>
 * @version 1.0.3.20200904-01, 18-01-2021
 */
public interface RolRepository extends CrudRepository<RolEntity, Integer> {

    /**
     * Busca todos los registros de roles en base a un conjunto de identificadores.
     *
     * @param idRoles {@link Iterable} con elmentos de tipo {@link Integer}
     * @return Objeto de tipo {@link Optional} con elemento {@link List}
     */
    @Query(value = "SELECT r FROM RolEntity r WHERE r.id IN :idRoles ORDER BY r.id ASC")
    Optional<List<RolEntity>> findAllById(@Param("idRoles") List<Integer> idRoles);

    @Query(value = "SELECT ur.rol FROM UserRolEntity ur WHERE ur.user.id = :idUser ORDER BY ur.id ASC")
    Optional<List<RolEntity>> findAllByUserId(@Param("idUser") long idUser);

}
