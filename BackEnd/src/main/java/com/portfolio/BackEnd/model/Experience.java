
package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter   
@Entity
public class Experience   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String img;
    private String position;
    private String time;
    private String task;
    private String id_person;
       
    public Experience(){
        
    }
    
    public Experience (Long id, String name, String img, String position,String time,String task ,String id_person){
        this.id = id;
        this.name = name;
        this.img = img;
        this.position = position;
        this.time = time;
        this.task = task;
        this.id_person = id_person;
    }
}
