
package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Abilities   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String skill;
    private String color;
    private String id_person;
       
    public Abilities(){
        
    }
    
    public Abilities (Long id, String name, String skill, String color, String id_person){
        this.id = id;
        this.name = name;
        this.skill = skill;
        this.color = color;
        this.id_person = id_person;
    }
}
