package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instância do objeto leia
       Scanner leia = new Scanner(System.in);

       // declaração de variáveis
       String nome;
       String email;
       int idade;
       double altura;

       
        // limpeza de buffer
       leia.nextLine();


       //entrada de dados
       System.out.println( "informe seu nome:");
       nome = leia.nextLine();
       System.out.println( "Informe sua idade");
       idade = leia.nextInt();
       System.out.println("Informe sua altura em metros:");
       altura = leia.nextDouble();
       System.out.println( "informe seu e-mail");
       email = leia.nextLine();

       // saída de dados
       System.out.println("Nome: " + nome);
       System.out.println("Idade: " +  idade);
       System.out.println("Altura: " + altura + "mts");
       System.out.println( " e-mail ");

       // fecha objeto close
       leia.close();
}
}