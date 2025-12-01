package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
    // instacia classe Scanner
    Scanner leia = new Scanner(System.in);

    //declaração de variaveis
    double x;
    double y;
    double resultado;
    String operador;
    

    //entrada de dados
    System.out.println( " Informe o valor de x: ");
    x = leia.nextDouble();
    System.out.println( " Informe o vlaor de y");
    y = leia.nextDouble();

      //limpeza de buffer
        leia.nextLine();


    //menu
    System.out.println(" 1 - soma");
    System.out.println(" 2 - subtração");
    System.out.println(" 3 - multiplicação");
    System.out.println("4 - Divisão");
    operador = leia.nextLine();

    switch(operador) {
        case "1":
        resultado = x+y;
            System.out.println(" Valor da soma" + resultado );
            break;
        case "2":
        resultado = x-y;
            System.out.println(" Valor da subtração " + resultado);
            break;
           
        case "3":
        resultado = x*y;
            System.out.println(" Valor da multiplicação " + resultado);
            break;
           
        case "4":
        resultado = x/y;
            System.out.println(" Valor da Divisão " + resultado);
            break;

        default:
        System.out.println(" Opção inválida");
           
    }

    //fecha objeto leia
    leia.close();
    }
}
