package com.atividade_01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    


        // Criando o scanner para capturar a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Solicitando os dados do usuário
        System.out.println("=== Cadastro de Usuário ===");
        
        System.out.print("Nome: ");
        String nome = sc.nextLine();  // Lê o nome
        
        System.out.print("Data de nascimento (DD/MM/AAAA): ");
        String dataNasc = sc.nextLine();  // Lê a data de nascimento
        
        System.out.print("CPF (somente números): ");
        String cpf = sc.nextLine();  // Lê o CPF
        
        System.out.print("E-mail: ");
        String email = sc.nextLine();  // Lê o e-mail
        
        System.out.print("Telefone: ");
        String telefone = sc.nextLine();  // Lê o telefone
        
        // Exibindo os dados na tela
        System.out.println("\n=== Dados informados ===");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        
        // Fechando o scanner
        sc.close();
    }




         
        
       
    }

