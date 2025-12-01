package com.alfandega.app;

import java.util.Scanner;  

public class App { 
  
    public static void main(String[] args) throws Exception {
       //instacia a classe Scanner
       Scanner leia = new Scanner(System.in);

       // declaração de variávies
       String nome;
       String resultado;
       double valor;

       // entrada de dados  
       System.out.println( " informe o nome do passageiro");
       nome = leia.nextLine();
       System.out.println(" Informe o valor da bagagem em U$$.");
       valor = leia.nextDouble();

       //Verifica o valor
       resultado = (valor <= 1000) ? " está liberado " : " está retido ";

       //mostra o resultado
       System.out.println(nome + resultado);


       








       //fecha objeto leia
       leia.close();
    }
}
