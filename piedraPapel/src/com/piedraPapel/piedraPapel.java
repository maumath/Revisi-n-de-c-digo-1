package com.piedraPapel;

import java.util.Scanner;

public class piedraPapel {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);  // Se corrigió la sintaxis y se importó.
        
       
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();
        
        // Se eleiminó un scanner inecesario.
        
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();
        
        // se mofifico por la sitaxis correcta == a equals, para comparar strings.
        if (j1.equals(j2)) {
            System.out.println("Empate"); 
        } else {
            int g = 2; 
            
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        g = 1; 
                    }
                    break; //se añadio break por que la sintaxis de switch así lo requiere.
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1; 
                    }
                    break;
                default:
                    System.out.println("Entrada inválida."); //"Manejo" de error, por si alguna, entrada es inválida.
                    return; 
            }
            System.out.println("Gana el jugador " + g); //Muestra el ganador.
        }
    }
}