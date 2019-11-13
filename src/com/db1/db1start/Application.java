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
    public Integer compararmaior(Integer numero1, Integer numero2){
        if(numero1 > numero2){
            return numero1;
        }
        return numero2;
    }
    public Integer impares(Integer numero1){
        if(numero1%2==0){
            return numero1/2;
        }
        return  (numero1 + 1)/2;
    }
    public String maiusculas(String texto1){
        return texto1.toUpperCase();
    }
    public String minusculas(String texto1){
        return texto1.toLowerCase();
    }
//    public Integer quantidadeLetras(String txt) {
//        Integer numero = 0;
//        Integer total = (txt.trim().length());
//        for (Integer i = 0; i < total; i++) {
//            if (txt.charAt(i) == '0' | txt.charAt(i) == '1' | txt.charAt(i) == '2' | txt.charAt(i) == '3'
//                    | txt.charAt(i) == '4' | txt.charAt(i) == '5' | txt.charAt(i) == '6' | txt.charAt(i) == '7' | txt.charAt(i) == '8'
//                    | txt.charAt(i) == '9') {
//                numero++;
//            }
//        }
//        return (total - numero);
//    }
//        public Integer quantidadeLetrasComEspaco (String txt){
//            Integer numero = 0;
//            Integer total = (txt.trim().length());
//            for (Integer i = 0; i < total; i++) {
//                if (txt.charAt(i) == '0' | txt.charAt(i) == '1' | txt.charAt(i) == '2' | txt.charAt(i) == '3'
//                        | txt.charAt(i) == '4' | txt.charAt(i) == '5' | txt.charAt(i) == '6' | txt.charAt(i) == '7' | txt.charAt(i) == '8'
//                        | txt.charAt(i) == '9') {
//                    numero++;
//                }
//            }
//            return (total - numero);
//        }
    public Integer quantidadeLetras(String txt) {
        String palavra = "DB1Start";
        return removeNumerosDeString (palavra).length();
    }

    private String removeNumerosDeString(String palavra) {
        return palavra.replaceAll("[0-9]", "");
    }
    public Integer quantidadeLetrasComEspaco(String txt) {
        String palavra = " DB1Start ";
        return removeNumerosDeString (palavra).trim().length();
    }


}
