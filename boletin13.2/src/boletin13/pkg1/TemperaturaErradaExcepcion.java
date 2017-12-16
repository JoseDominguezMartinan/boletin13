/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13.pkg1;

/**
 *
 * @author jose
 */
public class TemperaturaErradaExcepcion extends Exception {

    public TemperaturaErradaExcepcion() {
        super("non se poden insertar temperaturas menores a 80ºC");
    }

    public TemperaturaErradaExcepcion(String message) {
        super(message);
    }
    
    
}
