
package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter   
@Entity
public class Person   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String image;
    private String backImage;
    private String position;
    private String skills;
    private String description;
    private String ubication;
    
    public Person(){
        
    }
    
    public Person (Long id, String name, String image, String backImage, String position, String skills, String description, String ubication){
        this.id = id;
        this.name = name;
        this.image = image;
        this.backImage = backImage;
        this.position = position;
        this.skills = skills;
        this.description = description;
        this.ubication = ubication;
    }
}
