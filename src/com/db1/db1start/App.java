package com.db1.db1start;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //palavras reservadas
        /*
        package
        public
        static
        void
        class

        metodo main é necessário para que o java consiga entender
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        Integer numero1 =  scan.nextInt();

        System.out.println("Digite outro numero: ");
        Integer numero2 = scan.nextInt();

        System.out.println(numero1 + numero2);

        
    }
}
