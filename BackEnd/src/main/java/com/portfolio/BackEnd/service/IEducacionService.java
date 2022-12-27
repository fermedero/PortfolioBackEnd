
package com.portfolio.BackEnd.service;

import com.portfolio.BackEnd.model.Education;
import java.util.List;

/**
 *
 * @author MEDERO
 */
public interface IEducacionService {
    public List<Education> verEducacion ();
    public void crearEducacion (Education educ);
    public void borrarEducacion (Long id);
    public Education buscarEducacion (Long id);
}
