/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.Logica.Calculadora;

/**
 *
 * @author iris recinos
 */
public class ClsOperacionesMat {
    private double Dato1;
    private double Dato2;

    public double getDato1() {
        return Dato1;
    }

    public void setDato1(double Dato1) {
        this.Dato1 = Dato1;
    }

    public double getDato2() {
        return Dato2;
    }

    public void setDato2(double Dato2) {
        this.Dato2 = Dato2;
    }

    public double Suma(double Dato1, double Dato2) {
        this.Dato1 = Dato1;
        this.Dato2 = Dato2;
        
        return Dato1 + Dato2;
    }

    
    }
    

    
        
    
    
    

