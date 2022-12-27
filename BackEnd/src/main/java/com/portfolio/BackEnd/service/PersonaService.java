
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Person;
import com.portfolio.BackEnd.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MEDERO
 */
@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public  PersonaRepository persoRepo;
    
    
    @Override
    public List<Person> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Person per) {
         persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
       persoRepo.deleteById(id);
    }

    @Override
    public Person buscarPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
    }
    
}
