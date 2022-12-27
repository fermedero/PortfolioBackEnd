
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MEDERO
 */
@Repository
public interface EducacionRepository extends JpaRepository<Education, Long> {
    
}
