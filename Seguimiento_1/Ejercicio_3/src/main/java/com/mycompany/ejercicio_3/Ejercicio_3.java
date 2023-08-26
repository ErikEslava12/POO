/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_3;

/**
 *
 * @author erike
 */

//Ejercicio Propuesto N12
public class Ejercicio_3 {

    public static void main(String[] args) {
        float horas;
        float precio_hora;
        float rete_fuente;
        float salario_bruto;
        float salario_neto;
        
        horas = 48;
        precio_hora = 5000;
        salario_bruto = horas*precio_hora*4; //Al mes, para 4 semanas
        rete_fuente = (float) (0.125*salario_bruto);
        salario_neto = salario_bruto - rete_fuente;
        System.out.println("El salario bruto para un mes es: "+salario_bruto+"$ pesos.");
        System.out.println("La retención en la fuente es: "+rete_fuente+"$ pesos.");
        System.out.println("El salario neto es: "+salario_neto+"$ pesos.");
           
    }
}
