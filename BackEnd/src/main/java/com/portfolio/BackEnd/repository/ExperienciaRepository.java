/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.BackEnd.repository;

import com.portfolio.BackEnd.model.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MEDERO
 */
@Repository
public interface ExperienciaRepository extends JpaRepository<Experience, Long>{
    
}
