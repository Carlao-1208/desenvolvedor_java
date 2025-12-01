package com.atividade_03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // instacia o Scanner
    Scanner leia = new Scanner(System.in);

    //declaracao de variáveis
    String nome;
    String resultado;
    double peso;
    double altura;
    double imc;


    //entrada de dados
    System.out.println(" Informe o nome.:");
    nome = leia.nextLine();
    System.out.println("Informe o peso em Kg.:");
    peso = leia.nextDouble();
    System.out.println(" Informe altura em metros.:");
    altura = leia.nextDouble();

    //Calcular o imc
    imc = peso/Math.pow(altura, 2);

    //exibe o imc na tela
    System.out.println(nome +  ", seu IMC é"  + String.format("%.2f" , imc)  +  ".");

    //exibe o diagnóstico
    resultado = (imc <18.5) ? " está abaixo do peso" :
    (imc < 25) ? "está no peso ideal" :
    (imc < 30) ? " está acima do peso." :
    (imc < 35) ? "está obeso" :
    (imc < 40) ? "está com obesidade nível 2" :
    "está com obesidade mórbida";

    //exibe o resultado
    System.out.println(nome + resultado + ".");



    //fecha o objeto leia
    leia.close();
    
    
    }
}
