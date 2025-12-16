/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculos.ahorcado;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Ahorcado {

    public static void main(String[] args) {
         char[] palabra = {'h','o','l','a'};


       char[] progreso = new char[palabra.length];
        for (int i = 0; i < progreso.length; i++) {
           progreso[i] = '_';

        }
 
        Scanner sc = new Scanner(System.in);

       int intentos = 6; 

        boolean ganado = false;

     

       while (intentos > 0 && !ganado) {
            System.out.print("Palabra: ");
            for (char c : progreso) {
               System.out.print(c + " ");
           }

            System.out.println("\nIntentos restantes: " + intentos);
 
            

            System.out.print("Introduce una letra: ");

           char letra = sc.next().charAt(0);
 
          

            boolean acierto = false;

            for (int i = 0; i < palabra.length; i++) {
                if (palabra[i] == letra) {
                    progreso[i] = letra;
                   acierto = true;

               }

            }

            if (!acierto) {
               intentos--;
                System.out.println("Fallaste!");
           } else {
                System.out.println("¡Bien hecho!");
           }
 
            ganado = true;

            for (int i = 0; i < progreso.length; i++) {
                if (progreso[i] == '_') {
                    ganado = false;
                   break;
               }
           }
       } 

        if (ganado) {
           System.out.println("¡Felicidades! Has adivinado la palabra: HOLA");
        } else {
          System.out.println("Has perdido. La palabra era: HOLA");
        }
    }
}

 