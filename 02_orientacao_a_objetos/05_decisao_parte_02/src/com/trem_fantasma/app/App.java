package com.trem_fantasma.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // instacia a calsse Scanner
        Scanner leia = new Scanner(System.in);

        //declaração de variáveis
        String nome;
        int idade;
        double altura;

        //entrada de dados
        System.out.println(" informe o nome ");
        nome = leia.nextLine();
        System.out.println(" Informe a idade ");
        idade = leia.nextInt();
        System.out.println(" Informe a altura em metros");
        altura = leia.nextDouble();


        //estrutua de decisao
        if(idade >= 14 && altura >= 1.5){
            System.out.println(nome + " foi liberado. ");
        }

        else{
            System.out.println(nome + "não foi autorizado" );
            
            
        }
            
        }
        







        //fecha o objeto Scanner
         leia.close();
    }
}
