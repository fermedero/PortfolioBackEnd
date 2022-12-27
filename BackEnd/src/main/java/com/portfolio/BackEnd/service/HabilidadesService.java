
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Abilities;
import com.portfolio.BackEnd.repository.HabilidadRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MEDERO
 */
@Service
public class HabilidadesService implements IHabilidadesService{

    @Autowired
    public  HabilidadRepository habilidadRepo;

    @Override
    public List<Abilities> verHabilidad() {
       return habilidadRepo.findAll();
    }

    @Override
    public void crearHabilidad(Abilities hab) {
        habilidadRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilidadRepo.deleteById(id);
    }

    @Override
    public Abilities buscarHabilidad(Long id) {
        return habilidadRepo.findById(id).orElse(null);
    }
    
}