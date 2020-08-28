/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.clase02.laboratorio1;

import java.util.Scanner;

/**
 *
 * @author iris recinos
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System. in);
        
        System.out.println("Escribe tu nombre");
        String Nombre = sc . next();
        
        System.out.println(Nombre);
        
        System.out.println("Escribe tu edad");
        int  Edad = sc . nextInt();
        
        System.out.println("Sexo(F/M) ");
        String Sexo = sc.next();
        
        System . out .println("Escriba su peso");
        double Peso = sc. nextDouble ();
        
        System . out .println("Coloca tu altura");
        double Altura = sc .nextDouble();
        
        
//        instacia de la clase 
        Persona persona1 = new Persona (Nombre,Edad,Sexo, Altura, Peso);
        System.out.println(persona1.EsMayorDeEdad());
        System.out.println(persona1.toPersonaNum1());
        
        
        Persona persona2 = new Persona (persona1.getNombre(),persona1.getEdad(),persona1.getSexo());
        System.out.println(persona2.EsMayorDeEdad());
        System.out.println(persona2.toPersoNum2());
    
        
        Persona persona3= new Persona();
        persona3.setNombre(Nombre);
        persona3.setEdad(Edad);
        persona3.setSexo(Sexo);
        persona3.setPeso(Peso);
        persona3.setAltura(Altura);
        
       
        System.out.println(persona3.EsMayorDeEdad());
        System.out.println(persona3.toPersonaNum1());
        
       
        
        
        
        
       
        
    
//        persona.setNombre(Nombre);
//        persona.setEdad(Edad);
//        persona.setSexo(Nombre);
//        persona.setPeso(Peso);
//        persona.setAltura(Altura);
        
//        System.out.println(persona1.EsMayorDeEdad());
//        System.out.println(persona1);

        
        
        
        
        
        
    }
    
}
