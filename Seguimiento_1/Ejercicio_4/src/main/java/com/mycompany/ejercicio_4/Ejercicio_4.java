/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;
import java.util.Scanner;
/**
 *
 * @author erike
 */

//Ejercicio Propuesto N14
public class Ejercicio_4 {

    public static void main(String[] args) {
        float X;
        float Y;
        float Z;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("ingrese un número: ");
        X = Entrada.nextFloat();
        Y =(float) Math.pow(X,2);
        Z =(float) Math.pow(X,3);
        System.out.println("El cuadrado es:"+Y+" .Y el cubo es: "+Z);
                
    }
}
