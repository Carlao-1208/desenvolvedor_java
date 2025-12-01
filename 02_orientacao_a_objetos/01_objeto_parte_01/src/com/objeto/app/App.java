package com.objeto.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        //Entrada de dados
        System.out.println("Informe o nome:");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF.");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o e-mail");
        usuario.email = leia.nextLine();
        System.out.println("Informe a idade");
        usuario.idade = leia.nextInt();
        System.out.println("informe a altura em metros");
        usuario.altura = leia.nextDouble();

        //saída de dados
        usuario.exibirDados();

        //fecha objeto leia
        leia.close();
    }
}
