/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author kiuub
 */
public class Calculadora {
    
    public int suma(double a, double b){
        int c = (int) (a+b);
        return c;
    }
    public int suma(int a, int b){
        int c = a+b;
        return c ;
        
    }
    
    public int resta(double a,double b){
        int c = (int) (a-b);
        return c;
    }
    public int resta(int a, int b){
        int c = a-b;
        return c ;
    }
    
    public double multiplicacion(double a, double b){
        double c = a*b;
        return c;
    }
    
    public double division(double a, double b){
        
        double c = a/b;
        return c ;
    }
            
}
