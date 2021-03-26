package co.edu.escuelaing.arep.parcial2.service;

/**
 * Clase Calculator
 */
public interface Calculator {

    /**
     * Metodo que devuelve el arco coseno de un numero Double
     *
     * @param number - numero al que desea sacar el acos
     * @return - resultado de la operacion
     */
    Double acos(Double number);

    /**
     * Metodo que devuelve el exp de un numero Double
     *
     * @param number - numero al que desea sacar  el exp
     * @return - Cadena JSON del resultado
     */
    String exp(Double number);

}
