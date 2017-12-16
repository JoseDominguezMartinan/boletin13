/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13.pkg1;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin131 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // creamos un obxeto de tipo Scanner para que o usuario inserte a temperatura a convertir 
        Scanner sc = new Scanner(System.in);
        // creamos un obxeto de tipo ConversorTemperaturas
        ConversorTemperaturas conversor = new ConversorTemperaturas();
        // pedimos por teclado a temperatura a convertir
        System.out.println("Inserte a temperatura da que se quere facer a conversión");
        float grados = sc.nextFloat();
        // capturamos a exceppcion no caso de convertir a grados fhareint
        try {
            conversor.centigradosAFhareint(grados);
            System.out.println(conversor.getFahreint() + "ºFhareint");
        } catch (TemperaturaErradaExcepcion ex1) {
            System.out.println("Non se poden convertir a fahreint  temperaturas menores a 80ºc");
        }
        // no caso de grados reamur xa o fixemos na clase ConversorTemperaturas, polo que solo facenmos a chamada
        conversor.centigradosAReamur(grados);

    }

}
