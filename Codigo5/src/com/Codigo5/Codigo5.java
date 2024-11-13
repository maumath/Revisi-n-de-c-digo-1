package com.Codigo5;

import java.util.Scanner;

public class Codigo5 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); //Agregar System.in para que el usuario pueda ingresar su número. Corrección de sintaxis.
        System.out.print("Introduzca un número: ");
       
        int ni = s.nextInt();
        
        int afo = 0;  // Contador de dígitos afortunados
        int noAfo = 0;  // Contador de dígitos no afortunados
        
        while (ni > 0) {
            int digito = ni % 10;  // Obtener el último dígito, dado que estamos en base 10, todo número se descompone como a_1*10^n + a_2*10^n-1 + ...+ a_n-1*10^1 +a_n * 10^0, luego a_1*10^n + a_2*10^n-1 + ...+ a_n-1*10^1 +a_n * 10^0 % 10 = a_n, ósea el último dígito.
            System.out.println(digito);
            
          
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) { //Aquí sólo va a tomar como afortunados cuando a_n = 3, 7,8 ó 9
                afo++;
            } else {    // si a_n = 0,1,2,4,5,6,7 pasa a esta parte del código.
                noAfo++;
               
            }
            
            ni /= 10;  // antes de evaluarse de nuevo ni en el ciclo, se reasigna con el valor del cociente de la división, esto es: cociente=ni/10, pero como ni=a_1*10^n + a_2*10^n-1 + ...+ a_n-1*10^1 +a_n * 10^0, luego a_1*10^n + a_2*10^n-1 + ...+ a_n-1*10^1 +a_n * 10^0, entonces cociente = a_1*10^n-1 + a_2*10^n-2+ ...+ a_n-1, excepto cuando ni<10, en ese caso ni=0.
            System.out.println(ni);
            
        }
        
       //Esta parte se saco del bucle. Pues afo y noAnfo, determinan si el número ingresado es afortunado o no, por lo que el conteo debe de terminar.
        if (afo > noAfo) {
            System.out.println("El número es afortunado.");
        } else {
            System.out.println("El número no es afortunado.");
        }
        
        s.close();  
    }
}