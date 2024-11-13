package com.codigo6;

import java.util.Scanner;

public class codigo6 {
	
	 public static void main(String[] args) {
	      
	       
	        int[] n = new int[20];  // Crear el arreglo de tipo int, en este caso particular para 20 elementos.
	        
	        
	        for (int i = 0; i < 20; i++) {
	            n[i] = (int)(Math.random() * 381) + 20; // agrega al arreglo n, un elemento aleatorio entre 20 y 400.
	            System.out.print(n[i] + " ");
	        }
	        
	      
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("\n¿Qué números quiere resaltar?"); 
	        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	        int opcion = scanner.nextInt();
	        

	        int multiplo = (opcion == 1) ? 5 : 7; // Se corrige el operador ternario (sintaxis).
	        
	     
	        System.out.println("\nNúmeros resaltados:");
	        for (int i = 0; i < n.length; i++) {
	            if (n[i] % multiplo == 0) {
	                System.out.print("[" + n[i] + "] ");
	            } else {
	                System.out.print(n[i] + " ");
	            }
	        }
	        
	        scanner.close(); 
	    }
	

}


