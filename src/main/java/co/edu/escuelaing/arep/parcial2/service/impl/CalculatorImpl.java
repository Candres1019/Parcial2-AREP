package co.edu.escuelaing.arep.parcial2.service.impl;

import co.edu.escuelaing.arep.parcial2.service.Calculator;

public class CalculatorImpl implements Calculator {

    /**
     * Metodo que devuelve el arco coseno de un numero Double
     *
     * @param number - numero al que desea sacar el acos
     * @return - resultado de la operacion
     */
    @Override
    public Double acos(Double number) {
        return Math.acos(number);
    }

    /**
     * Metodo que devuelve el exp de un numero Double
     *
     * @param number - numero al que desea sacar  el exp
     * @return - Cadena JSON del resultado
     */
    @Override
    public String exp(Double number) {
        String operation = "exp";
        return "{\"operation\": \"" + operation + "\", \"input\": \"" + number + "\", \"output\": \"" + Math.exp(number) + "\"}";
    }

}