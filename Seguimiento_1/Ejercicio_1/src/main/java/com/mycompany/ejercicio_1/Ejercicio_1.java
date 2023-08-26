/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_1;
import java.util.Scanner;

/**
 *
 * @author erike
 */

//Ejercicio Resuelto N4
public class Ejercicio_1 {

    public static void main(String[] args) {
        int EDJUAN;
        int EDALBER;
        int EDANA;
        int EDMAMA;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan: ");
        EDJUAN = Entrada.nextInt();
        EDALBER = 2*EDJUAN/3;
        EDANA = 4*EDJUAN/3;
        EDMAMA = EDJUAN + EDALBER + EDANA;
        System.out.println("La edad de todos es: "+"La edad de la mamá:"+EDMAMA);
        System.out.println("La edad de Alber:"+EDALBER);
        System.out.println("La edad de Ana:"+EDANA);
        System.out.println("Y La edad de Juan:"+EDJUAN);
        
    }
}
