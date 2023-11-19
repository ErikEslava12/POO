/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo83;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author erike
 */

public class VentanaPrincipal extends JFrame implements 
ActionListener {
    private Container contenedor;

    private JButton cilindro, esfera, piramide;


    public VentanaPrincipal(){
        inicio();
        setTitle("Figuras"); 
        setSize(350,160); // Establece el tamaño de la ventana
        setLocationRelativeTo(null); /* La ventana se posiciona en el 
    centro de la pantalla */
    // Establece que el botón de cerrar permitirá salir de la aplicación
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    private void inicio() {
        contenedor = getContentPane(); /* Obtiene el panel de 
        contenidos de la ventana */
        contenedor.setLayout(null); /* Establece que el contenedor no 
        tiene un layout */
        // Establece el botón del cilindro
        cilindro = new JButton();
        cilindro.setText("Cilindro");
        cilindro.setBounds(20, 50, 80, 23);
        cilindro.addActionListener(this);
    // Establece el botón de la esfera
        esfera = new JButton();
        esfera.setText("Esfera");
        esfera.setBounds(125, 50, 80, 23); /* Establece la posición del 
        botón de la esfera */
        /* Agrega al botón un ActionListener para que gestione eventos 
        del botón */
        esfera.addActionListener(this);
        // Establece el botón de la pirámide
        piramide = new JButton();
        piramide.setText("Piramide");
        piramide.setBounds(225, 50, 100, 23); /* Establece la posición 
        del botón de la pirámide */
        /* Agrega al botón un ActionListener para que gestione eventos 
        del botón */
        piramide.addActionListener(this);
        // Se añade cada componente gráfico al contenedor de la ventana
        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
    }
    
    @Override
    
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) { // Si se pulsa el botón esfera
            VentanaEsfera esfera = new VentanaEsfera(); /* Crea la 
            //ventana de la esfera */
            esfera.setVisible(true); 
        }
        if (evento.getSource() == cilindro) { /* Si se pulsa el botón 
        cilindro */
            VentanaCilindro cilindro = new VentanaCilindro(); 
            cilindro.setVisible(true); 
        }
        if (evento.getSource() == piramide) { /* Si se pulsa el botón 
            pirámide */
            VentanaPiramide piramide; /* Crea 
           // la ventana de la pirámide */
            piramide = new VentanaPiramide();
            piramide.setVisible(true); /* Establece que se visualice la 
           // ventana de la pirámide */
        }
    }
}
