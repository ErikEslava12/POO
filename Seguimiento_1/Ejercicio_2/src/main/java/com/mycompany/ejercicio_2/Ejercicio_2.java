/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2;

/**
 *
 * @author erike
 */

//Ejercicio Resuelto N5
public class Ejercicio_2 {
    
    public static void main(String[] args) {
       /* System.out.println("Ingrese el valor de X");*/
       float SUMA;
       float X;
       float Y;
       double Z;
       
       SUMA = 0;
       X = 20;
       SUMA = X + SUMA;
       Y = 40;
       Z = Math.pow(Y, 2);
       float A = (float)Z;
       X = X + A;
       SUMA = SUMA + X/Y;
       System.out.println("El valor de la suma es: "+SUMA);
               
             
    }
}
