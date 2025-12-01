package com.contador.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        //instacia o Scanner
        Scanner leia = new Scanner(System.in);

        //Declaração de variável
        int n;

        //Entrada de dados
        System.out.println(" Informe um número inteiro:");
        n = leia.nextInt();

        // Loop(Laço de repetição)
        while(n >= 0){
            System.out.println(n);
            n--;
        }
        
        
        
        
        
        //fecha o objeto Leia
        leia.close();
    }
}
