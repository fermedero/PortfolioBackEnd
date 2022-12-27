
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Education;
import com.portfolio.BackEnd.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MEDERO
 */
@Service
public class EducacionService implements IEducacionService{

    @Autowired
    public EducacionRepository educRepo;
    
    @Override
    public List<Education> verEducacion() {
        return educRepo.findAll();
    }

    @Override
    public void crearEducacion(Education educ) {
        educRepo.save(educ);
    }

    @Override
    public void borrarEducacion(Long id) {
        educRepo.deleteById(id);
    }

    @Override
    public Education buscarEducacion(Long id) {
       return educRepo.findById(id).orElse(null);
    }
    
}
