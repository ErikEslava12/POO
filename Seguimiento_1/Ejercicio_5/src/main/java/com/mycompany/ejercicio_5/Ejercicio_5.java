/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_5;
import java.util.Scanner;
/**
 *
 * @author erike
 */
//Ejercicio Propuesto N17
public class Ejercicio_5 {

    public static void main(String[] args) {
        float Radio;
        float Area;
        float Longitud;
        Scanner A = new Scanner(System.in);
        System.out.println("Ingresa el radio del círculo: ");
        Radio = A.nextFloat();
        Area = (float) Math.PI * (float) Math.pow(Radio, 2);
        Longitud = Radio*2;
        System.out.println("El Área del círculo es: "+Area+" unidades cuadradas.");
        System.out.println("La Longitud de la circunferencia es: "+Longitud+" unidades longitudinales.");
        
    }
}
