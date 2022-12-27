
package com.portfolio.BackEnd.service;


import com.portfolio.BackEnd.model.Projects;
import java.util.List;

/**
 *
 * @author MEDERO
 */
public interface IProyectoService {
    public List<Projects> verProyecto ();
    public void crearProyecto (Projects proy);
    public void borrarProyecto (Long id);
    public Projects buscarProyecto (Long id);
}
