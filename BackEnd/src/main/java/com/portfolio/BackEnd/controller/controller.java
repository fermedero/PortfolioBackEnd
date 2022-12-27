
package com.portfolio.BackEnd.controller;
import com.portfolio.BackEnd.model.Abilities;
import com.portfolio.BackEnd.model.Education;
import com.portfolio.BackEnd.model.Experience;
import com.portfolio.BackEnd.model.Person;
import com.portfolio.BackEnd.model.Projects;
import com.portfolio.BackEnd.service.IEducacionService;
import com.portfolio.BackEnd.service.IExperienciaService;
import com.portfolio.BackEnd.service.IHabilidadesService;
import com.portfolio.BackEnd.service.IPersonaService;
import com.portfolio.BackEnd.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {

//persona
    @Autowired
    private IPersonaService persoServ;

    //post
    @PostMapping("/newPerson")
    public void agregarPersona(@RequestBody Person pers){
       // listaPersona.add(pers);
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("/readPerson")
    @ResponseBody
    public List<Person> verPersonas(){
        //return listaPersona;
       return persoServ.verPersonas();
    }
    
    @DeleteMapping("/deletePerson/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    //edicion
       @PutMapping("/editPerson/{id}")
    public void editarPersona(@RequestBody Person pers){
       // listaPersona.add(pers);
        persoServ.crearPersona(pers);
    }
//*************************************************************************************************************
//habilidades
     @Autowired
    private IHabilidadesService skillServ;

    //post
    @PostMapping("/newSkill")
    public void agregarSkill(@RequestBody Abilities skill){
       // listaPersona.add(pers);
        skillServ.crearHabilidad(skill);
    }
    
    @GetMapping ("/readSkill")
    @ResponseBody
    public List<Abilities> verSkills(){
        //return listaPersona;
       return skillServ.verHabilidad();
    }
    
    @DeleteMapping("/deleteSkill/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillServ.borrarHabilidad(id);
    }
    
    //edicion
       @PutMapping("/editSkill/{id}")
    public void editarSkill(@RequestBody Abilities skill){
       // listaPersona.add(pers);
        skillServ.crearHabilidad(skill);
    }
    
    //*************************************************************************************************************
//educacion
     @Autowired
    private IEducacionService educServ;

    //post
    @PostMapping("/newEduc")
    public void agregarEduc(@RequestBody Education educ){
       // listaPersona.add(pers);
        educServ.crearEducacion(educ);
    }
    
    @GetMapping ("/readEduc")
    @ResponseBody
    public List<Education> verEduc(){
        //return listaPersona;
       return educServ.verEducacion();
    }
    
    @DeleteMapping("/deleteEduc/{id}")
    public void borrarEduc(@PathVariable Long id){
        educServ.borrarEducacion(id);
    }
    
    //edicion
       @PutMapping("/editEduc/{id}")
    public void editarEduc(@RequestBody Education educ){
       // listaPersona.add(pers);
        educServ.crearEducacion(educ);
    }
    
    
     //*************************************************************************************************************
//experiencia
     @Autowired
    private IExperienciaService expServ;

    //post
    @PostMapping("/newExp")
    public void agregarExp(@RequestBody Experience exp){
       // listaPersona.add(pers);
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/readExp")
    @ResponseBody
    public List<Experience> verExp(){
        //return listaPersona;
       return expServ.verExperiencia();
    }
    
    @DeleteMapping("/deleteExp/{id}")
    public void borrarExp(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    //edicion
       @PutMapping("/editExp/{id}")
    public void editarExp(@RequestBody Experience exp){
       // listaPersona.add(pers);
        expServ.crearExperiencia(exp);
    }
    
     
     //*************************************************************************************************************
//proyectos
     @Autowired
    private IProyectoService proyServ;

    //post
    @PostMapping("/newProy")
    public void agregarProy(@RequestBody Projects proy){
       // listaPersona.add(pers);
        proyServ.crearProyecto(proy);
    }
    
    @GetMapping ("/readProy")
    @ResponseBody
    public List<Projects> verProy(){
        //return listaPersona;
       return proyServ.verProyecto();
    }
    
    @DeleteMapping("/deleteProy/{id}")
    public void borrarProy(@PathVariable Long id){
        proyServ.borrarProyecto(id);
    }
    
    //edicion
       @PutMapping("/editProy/{id}")
    public void editarProy(@RequestBody Projects proy){
       // listaPersona.add(pers);
        proyServ.crearProyecto(proy);
    }
    
    
}
