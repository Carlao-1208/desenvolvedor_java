package com.atividade_04;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
         // intancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        //decalração de variáveis
        String[] salas = new String[5];
        String nome;
        int idade;
        String sala;
        int idadeMinima = 0;
        String filme = "";


        //inicializar o array
        salas[0] = "A roda quadrada";
        salas[1] = "A volta dos que não foram";
        salas[2] = "poeira em alto mar";
        salas[3] = " As Tranças do rei careca";
        salas[4] = " A vingança do peixe frito";

        //Entrada de dados do usuário
        System.out.println("Informe o nome:");
        nome = leia.nextLine();
        System.out.println("Informe a idade:");
        idade = leia.nextInt();

        //limpeza de buffer
        leia.nextLine();

        //loop 
        do{
            //menu
            System.out.println("Sala 1 -" +salas[0] + "Livre");
            System.out.println("Sala 2 -" +salas[1] + "12 anos");
            System.out.println("Sala 3 -" +salas[2] + "14 anos");
            System.out.println("Sala 4 -" +salas[3] + "16 anos");
            System.out.println("Sala 5 -" +salas[4] + "18 anos");
            System.out.println("Informe a sala desejada:");
            sala = leia.nextLine();

            switch (sala) {
                case "1" :
                filme = salas[0];
                idadeMinima = 0;
                    break;
                case "2" :
                filme = salas [1];
                    break;
                case "3" :
                filme = salas[2];
                idadeMinima = 12;
                    break;
                case "4" :
                filme = salas[3];
                idadeMinima = 16;
                case "5" :
                filme = salas[4];
                idadeMinima = 18;
                    break;
                default:
                System.out.println("Sala inexistente.");
            }

            // verificação de idade
            if(idade >= idadeMinima) {
                System.out.println("filme escolhido.");
                System.out.println("Tenha um bom filme, " + nome);
                System.out.println("🎞");
            }
            else {
                System.out.println("Entrada não permitida.");
                System.out.println("Favor escolher outro filme");
               
                
            }

            
        } while (idade < idadeMinima);



        //fecha o objeto leia
        leia.close();
    }
}
