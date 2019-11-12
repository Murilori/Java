package com.db1.db1start;

import java.time.temporal.UnsupportedTemporalTypeException;

public class Application {

    public Integer soma(Integer numero1, Integer numero2){
        return numero1 + numero2;
    }
    public Integer subtracao(Integer numero1, Integer numero2){
        return numero1 - numero2;
    }
    public Integer multiplicacao(Integer numero1, Integer numero2){
        return numero1 * numero2;
    }
    public Integer div(Integer numero1, Integer numero2){
        return numero1 / numero2;
    }
    public Boolean par(Integer numero1){
        if(numero1%2 == 0){
            return  true;
        }
        return false;
    }
    public Double compararmaior(Double numero1, Double numero2){
        if(numero1 > numero2){
            return numero1;
        }
        return numero2;
    }

}
