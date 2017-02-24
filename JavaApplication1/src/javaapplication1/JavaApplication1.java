/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import Vehiculo.Vehiculo;

/**
 *
 * @author usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Vehiculo chevrolet = new Vehiculo();
        chevrolet.setPlaca("PFL877");
        chevrolet.setModelo("2009");
        chevrolet.setNumsoat("64638598");
        chevrolet.setColor("azul");
        
        System.out.println("Placa: " + chevrolet.getPlaca() 
                + "\n Modelo: " + chevrolet.getModelo()
                + "\n Numero soat: " + chevrolet.getNumsoat()
                + "\n Color: " + chevrolet.getColor());
                
        
        
    }
    
}
