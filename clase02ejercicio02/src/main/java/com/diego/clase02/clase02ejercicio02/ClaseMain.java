/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diego.clase02.clase02ejercicio02;

/**
 *
 * @author Usuario
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    
        Profesor Profe = new Profesor("Diego", "Chalatenango", "18/9/02", "M", 18, "Bachiller", "Estudiante");
        System.out.println(Profe.toString());
        
        Estudiante est = new Estudiante("Jenny", "Chalate", "14/11/94", "F", 28, 1500, "Ing. Sistemas y Computacion");
        
        System.out.println(est.toString());
    }
    
    
}
