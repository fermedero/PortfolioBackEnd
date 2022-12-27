/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.BackEnd.service;


import com.portfolio.BackEnd.model.Experience;
import java.util.List;

/**
 *
 * @author MEDERO
 */
public interface IExperienciaService {
    public List<Experience> verExperiencia ();
    public void crearExperiencia (Experience exp);
    public void borrarExperiencia (Long id);
    public Experience buscarExperiencia (Long id);
}
