package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;


public class App {
    public static void main(String[] args) throws Exception {
        //instacia objeto de entrada de dados
    Scanner leia = new Scanner(System.in);


    //instacia a classes
    Carro carro = new Carro();
    Moto moto = new Moto();

    //declaraçao de variaveis
    String combustivel;

    //entrada de dados
    System.out.println("Informe os dados do carro");
    System.out.println("Informe o fabricante:");
    carro.fabricante = leia.nextLine();
    System.out.println("Iforme o modelo");
    carro.modelo = leia.nextLine();
    System.out.println("Informe a cor:");
    carro.cor = leia.nextLine();
    System.out.println("Informe o ano");
    carro.ano = leia.nextLine();
    System.out.println("Informe a placa:");
    carro.placa = leia.nextLine();

    //padrão de cmbustível
    carro.motorFlex = false;
    carro.motorEletrico = false;
    carro.motorDiesel = false;
    carro.motorGasolina = false;
    carro.motorEtanol = false;

    //usuário informa o tipo de combustivel
    System.out.println("\nInforme o tipo de cobustivel\n");
    System.out.println("1 - Gasolina ");
    System.out.println("1 - Etanol ");
    System.out.println("2 - ambos");
    System.out.println("3 - Diesel");
    System.out.println("4 - Eletrico");
    combustivel = leia.nextLine();

    switch(combustivel) {
        case "1":
        carro.motorGasolina = true;
        break;
        case "2":
        carro.motorEtanol = true;
        break;
        case"3":
        carro.motorFlex = true;
        break;
        case"4" :
        carro.motorDiesel = true;
        case"5" :
        carro.motorEletrico = true;
        break;
        default:
        System.out.println("Motor inexistente.");

    }

    //entrada de dados da moto
    System.out.println("Informe os dados da moto");
    System.out.println("Informe o fabricante:");
    moto.fabricante = leia.nextLine();
    System.out.println("informe o modelof");
    System.out.println("informe a cor:");
    moto.cor = leia.nextLine();
    System.out.println("Informe o ano");
    moto.ano = leia.nextLine();
    System.out.println("informe a placa:");
    moto.placa = leia.nextLine();

    //saida de dados
    System.out.println("\nDados do carro\n");
    carro.exibirDados();
    System.out.println("\nDados do moto\n");
    moto.exibirDados();


    //fecha objeto leia
    leia.close();


    
       
    }
}
