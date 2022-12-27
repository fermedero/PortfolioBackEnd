package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter   
@Entity
public class Projects   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String date;
    private String description;
    private String link;
    private String observation;
    private String id_person;
       
    public Projects(){
        
    }
    
    public Projects (Long id, String name, String date, String description,String link,String observation ,String id_person){
        this.id = id;
        this.name = name;
        this.date = date;
        this.description = description;
        this.link = link;
        this.observation = observation;
        this.id_person = id_person;
    }
}
