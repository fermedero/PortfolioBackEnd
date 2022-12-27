/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolio;

import java.util.*;

/**
 *
 * @author MEDERO
 */
//public class Suma{
//    
//}

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Date date = new Date();
//        System.out.println(date.toString());
//        
//        int vector[]=new int[5];
//        Scanner teclado = new Scanner(System.in);
//        for (int i=0; i<vector.length;i++){
//            System.out.println("Ingrese el numero para la posicion " + i);
//            int tecla = teclado.nextInt();
//            vector[i]=tecla;
////        System.out.println(vector[1]);  
//        }
//        
        // Auto auto1 = new Auto ();
        Vehiculo vehi = new Vehiculo(1, 5, "ford", "ka");
        Auto auto2 = new Auto(1, "BB123KK", 5, "rojo", true, 88, 4, "marca de auto", "modelo auto");
        Moto moto = new Moto(125, 23, 78, "yamaha", "fz16");
        Camion camion = new Camion(6, true, 5, 0, "scania", "camionazo");

        Vehiculo vector[] = new Vehiculo[4];
        vector[0] = vehi;
        vector[1] = auto2;
        vector[2] = moto;
        vector[3] = camion;
        
        for(int i=0;i<4;i++){
            System.out.println("Registro " + i + vector[i].getMarca());
        }

        /*
        auto2.encender();
        auto2.frenar(50.6);
      
        System.out.println("El valor del id es " +  auto2.getId());
        auto2.setId(3000);
        System.out.println("El valor del id es " +  auto2.getId());
         */
 /*
        
        auto1.setId(10);
        auto1.setCajaManual(true);
        auto1.setCantPuertas(5);
        System.out.println("La id de auto1 es " + auto1.getId());
        System.out.println("La id de auto1 es " + auto1.getCantPuertas());
         */
    }

}
