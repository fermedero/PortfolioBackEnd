
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Projects;
import com.portfolio.BackEnd.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MEDERO
 */
@Service
public class ProyectoService  implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proyRepo;

    @Override
    public List<Projects> verProyecto() {
        return proyRepo.findAll();
    }

    @Override
    public void crearProyecto(Projects proy) {
       proyRepo.save(proy);
    }

    @Override
    public void borrarProyecto(Long id) {
       proyRepo.deleteById(id);
    }

    @Override
    public Projects buscarProyecto(Long id) {
       return proyRepo.findById(id).orElse(null);
    }
    
}
