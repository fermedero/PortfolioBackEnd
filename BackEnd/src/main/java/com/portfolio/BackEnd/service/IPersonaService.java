
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Person;
import java.util.List;

/**
 *
 * @author MEDERO
 */
public interface IPersonaService {
    public List<Person> verPersonas ();
    public void crearPersona (Person per);
    public void borrarPersona (Long id);
    public Person buscarPersona (Long id);
}
