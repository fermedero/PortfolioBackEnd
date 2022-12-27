
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Abilities;
import java.util.List;

/**
 *
 * @author MEDERO
 */
public interface IHabilidadesService {
    public List<Abilities> verHabilidad ();
    public void crearHabilidad (Abilities skill);
    public void borrarHabilidad (Long id);
    public Abilities buscarHabilidad (Long id);
}
