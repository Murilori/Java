package com.db1.db1start;

import java.util.Scanner;

public class App {

    public static String soma(Integer numero1, Integer numero2){
        Integer resultado;
        resultado = numero1 + numero2;
        return "o resultado é: " + resultado;
    }

    public static Integer subtracao(Integer numero1, Integer numero2){
        return numero1 - numero2;
    }

    public static String uperCase(String texto){
        return texto.toUpperCase();
    }
    public static String lowerCase(String texto){
        return texto.toLowerCase();
    }

    public static Double menor(Double valor1, Double valor2){
        if (valor1 < valor2){
            return valor1;
        }
        return valor2;
    }
    public static Double menor(Double valor1,Double valor2,Double valor3){
        return menor(menor(valor1,valor2),valor3);
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("numero 1: ");
//        Integer numero1 = scan.nextInt();
//        scan.nextLine();
//        System.out.println("numero 2: ");
//        Integer numero2 = scan.nextInt();
//        scan.nextLine();
//        System.out.println(soma(numero1,numero2)) ;
//        System.out.println(subtracao(numero1,numero2));
//        System.out.println("insira um texto: ");
//        String texto = scan.nextLine();
//        System.out.println(uperCase(texto));
//        System.out.println(lowerCase(texto));
        Double valor1 = scan.nextDouble();
        Double valor2 = scan.nextDouble();
        System.out.println(menor(valor1,valor2));

    }
}

//        System.out.println("digite um numero");
//        Integer numero1 = scan.nextInt();
//
//        System.out.println("digite outro numero");
//        Integer numero2 = scan.nextInt();
//
//        System.out.println(numero1 - numero2);

//
//        String textoNormal = scan.nextLine();
//
//        String textoEmMinusculo = textoNormal.toLowerCase();
//        String textoEmMaiusculo = textoNormal.toUpperCase();
//
//        System.out.println("texto normal: " + textoNormal );
//        System.out.println("texto minusculo: " + textoEmMinusculo );
//
//
//        System.out.println("texto maiusculo: " + textoEmMaiusculo );
//
//        System.out.println("digite o valor 1");
//        Double valor1 = scan.nextDouble();
//
//        System.out.println("digite o valor 2");
//        Double valor2 = scan.nextDouble();
//        if(valor1 > valor2){
//            System.out.println("valor 1 é maior que o valor 2");
//        }else {
//            System.out.println("valor 2 é maior que o valor 1");
//        }
//
//    }
//        System.out.println("digite o valor 1");
//        Double valor1 = scan.nextDouble();
//        System.out.println("digite o valor 2");
//        Double valor2 = scan.nextDouble();
//        System.out.println("digite o valor 3");
//        Double valor3 = scan.nextDouble();
//
//        if(valor1 < valor2 && valor1 < valor3  ) {
//            System.out.println("valor 1 é o menor: " + valor1 );
//        }else if (valor2 < valor3 && valor2 < valor1){
//            System.out.println("valor 2 é o menor: " + valor2);
//        }else {
//            System.out.println("valor 3 é o menor: " + valor3);
//        }