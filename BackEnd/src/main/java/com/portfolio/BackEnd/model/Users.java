package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter   
@Entity
public class Users   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private String rol;
       
    public Users(){
        
    }
    
    public Users (Long id, String email, String password, String rol){
        this.id = id;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
}
