/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo83;

/**
 *
 * @author erike
 */
public class Esfera extends FiguraGeometrica {

    private double radio;
    
    public Esfera(double radio) {
        this.radio = radio;
        this.setVolumen(calcularVolumen()); /* Calcula el volumen y 
        establece su atributo */
        this.setSuperficie(calcularSuperficie()); /* Calcula la superficie y 
        establece su atributo */
    }
    /**
    * Método para calcular el volumen de una esfera
    * @return El volumen de una esfera
    */
    public double calcularVolumen() {
        double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
        return volumen;
    }
    /**
    * Método para calcular la superficie de una esfera
    * @return La superficie de una esfera
    */
    public double calcularSuperficie() {
        double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
        return superficie;
    }
}
