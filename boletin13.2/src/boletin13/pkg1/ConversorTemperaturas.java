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
public class ConversorTemperaturas {

    public final float temperatura = 80;
    float fahreint;
    float reamur;
    boolean i = true;
    Scanner sc = new Scanner(System.in);

    /**
     * metodo que fara a conversion de grados centigrados a fahreint a excepcion
     * neste caso será tratada no metodo main
     *
     * @param centigrados
     * @return
     * @throws TemperaturaErradaExcepcion
     */
    public float centigradosAFhareint(float centigrados) throws TemperaturaErradaExcepcion {
        if (centigrados < temperatura) {

            throw new TemperaturaErradaExcepcion();

        } else {
            return fahreint = 9f / 5f * centigrados + 32.4f;
        }
    }

    /**
     * metodo que realiza a conversion de centigrados a reamus neste caso
     * capturarase aqui a excepcion
     *
     * @param centigrados
     * @return
     */
    public float centigradosAReamur(float centigrados) {
        while (i = true) {

            if (centigrados < temperatura) {
                System.out.println("numero non valido,volva a insertar o numero ");
                centigrados = sc.nextFloat();

            } else {

                reamur = 4.0f / 5.0f * centigrados;
                System.out.println(reamur + "grados Reamur");
                i = false;
                break;
            }
        }

        return reamur;
    }

    public float getFahreint() {
        return fahreint;
    }

    public float getReamur() {
        return reamur;
    }

}
