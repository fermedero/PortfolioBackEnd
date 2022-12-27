
package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter   
@Entity
public class Education   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String img;
    private String title;
    private String time;
    private String obs;
    private String id_person;
       
    public Education(){
        
    }
    
    public Education (Long id, String name, String img, String title,String time,String obs ,String id_person){
        this.id = id;
        this.name = name;
        this.img = img;
        this.title = title;
        this.time = time;
        this.obs = obs;
        this.id_person = id_person;
    }
}
