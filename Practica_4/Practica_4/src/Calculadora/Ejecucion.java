/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Calculadora;
import java.util.*;
/**
 *
 * @author kiuub
 */
public class Ejecucion {
    public static void main (String args[]){
        double a,b;
        int resp;
        Scanner entrada = new Scanner(System.in);
        Calculadora operacion = new Calculadora();
       
        System.out.println("ingrese el valor a: ");
        a = entrada.nextDouble();
        System.out.println("ingrese el valor b: ");
        b = entrada.nextDouble();
        do{
        System.out.println("que operacion quiere hacer?\n0. salir\n1. suma\n2. resta\n3. multiplicacion\n4. division");
        resp = entrada.nextInt();
        switch(resp){
            case 1:
                System.out.println("resultado : "+operacion.suma(a, b));
                
                break;
            case 2:
                System.out.println("resultado : "+operacion.resta(a, b));
                
                break;
            case 3:
                System.out.println("resultado : "+ operacion.multiplicacion(a, b));
               
                break;
            case 4:
                
                do{
                System.out.println("resultado : "+operacion.division(a, b));
                if(b==0){
                    System.out.println("el resultado es indeterminado\ningrese de nuevo el valor de b: ");
                    b = entrada.nextDouble();
                }
                }while(b==0);
                break;
            case 0:
                break;
                
        }
    }while(resp!=0);
      
        
    }
    
}
