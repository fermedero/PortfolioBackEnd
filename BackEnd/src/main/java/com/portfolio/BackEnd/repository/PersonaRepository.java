
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MEDERO
 */

@Repository
public interface PersonaRepository extends JpaRepository<Person, Long>{
    
}


