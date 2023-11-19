/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo83;

/**
 *
 * @author erike
 */
class FiguraGeometrica {
    
    private double volumen; /* Atributo que identifica el volumen de 
una figura geométrica */
    private double superficie; 
    
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    /**
    * Método para obtener el volumen de una figura geométrica
    * @return El volumen de una figura geométrica
    */
    public double getVolumen() {
        return this.volumen;
    }
    /**
    * Método para obtener la superficie de una figura geométrica
    * @return La superficie de una figura geométrica
    */
    public double getSuperficie() {
        return this.superficie;
    }
}
