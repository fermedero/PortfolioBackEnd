
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Abilities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MEDERO
 */

@Repository
public interface HabilidadRepository extends JpaRepository<Abilities, Long>{
    
}
