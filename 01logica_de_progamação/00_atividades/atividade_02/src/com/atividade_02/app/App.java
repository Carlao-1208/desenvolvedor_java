package com.atividade_02.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        //Instacia Scanner
        Scanner leia = new Scanner(System.in);

        //equação do 1º grau:a*x + b = 0

        //declaração de variáveis
        double a;
        double b;
        double x;

        //entrada de dados
        System.out.println(" Informe o valor de 'a': ");
        a = leia.nextDouble();
        System.out.println(" Informe o valor de 'b': ");
        b = leia.nextDouble();

        //Calcula a equação do 1º grau a*x + b = 0
        if (a != 0) {
            x = b/a;
            System.out.println("x = " x);
        }    

        else{
            System.out.println("Não existe raíz real");
        }    
        

      

        //fecha objeto Leia
        leia.close();
    




    }
}
