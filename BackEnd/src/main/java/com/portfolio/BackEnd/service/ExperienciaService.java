/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Experience;
import com.portfolio.BackEnd.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MEDERO
 */
@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    public ExperienciaRepository expRepo;
    @Override
    public List<Experience> verExperiencia() {
       return expRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experience exp) {
       expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
      expRepo.deleteById(id);
    }

    @Override
    public Experience buscarExperiencia(Long id) {
       return expRepo.findById(id).orElse(null);
    }
    
}
