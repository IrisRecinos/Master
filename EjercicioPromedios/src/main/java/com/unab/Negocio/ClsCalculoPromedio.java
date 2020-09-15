/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.Negocio;

/**
 *
 * @author iris recinos
 */
public class ClsCalculoPromedio {
    public Double FunPromedio1(String num1,String num2){
        Double Lab1=Double.parseDouble(num1);
        Double Par1=Double.parseDouble(num2);
        
        Double PromedioLab1=Lab1*0.40;
        Double PromedioPar1=Lab1*0.60;
        
        Double Promedio =PromedioLab1 +PromedioPar1;
        Promedio /=3;
        
        return Promedio;
        
    }
    
    public Double FunPromedio2(String num1,String num2){
        Double Lab2=Double.parseDouble(num1);
        Double Par2=Double.parseDouble(num2);
        
        Double PromedioLab2=Lab2*0.40;
        Double PromedioPar2=Lab2*0.60;
        
        Double Promedio =PromedioLab2 +PromedioPar2;
        Promedio /=3;
        
        return Promedio;
        
    }
        
    
    public Double FunPromedio3(String num1,String num2){
        Double Lab3=Double.parseDouble(num1);
        Double Par3=Double.parseDouble(num2);
        
        Double PromedioLab3=Lab3*0.40;
        Double PromedioPar3=Lab3*0.60;
        
        Double Promedio =PromedioLab3 +PromedioPar3;
        Promedio /=3;
        
        return Promedio;
    }
  public Double FunPromedioFinal(Double Pro1, Double Pro2, Double Pro3) {     
   Double total =Pro1+Pro2+Pro3;
   return total;
  }
  
}
