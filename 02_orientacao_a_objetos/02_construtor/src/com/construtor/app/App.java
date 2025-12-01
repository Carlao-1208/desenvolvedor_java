package com.construtor.app;

import java.util.Scanner;
import com.construtor.models.Pessoa;
public class App {
    public static void main(String[] args) throws Exception {
        //instacias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa("", "", "", "", 0);

        //Entrada de dados
        System.out.println("Informe seu nome");
        usuario.nome = leia.nextLine();
        System.out.println("Informe seu CPF");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe seu e-mail");
        usuario.email = leia.nextLine();
        System.out.println("Informe seu telefone");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a idade:");
        ususario.idade = leia.nextInt();

        //saída de dados
        System.out.println("usuario.apresentar"());

        //fecha objeto leia
        leia.close();
        
    }
}
