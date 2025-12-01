package com.abstracao.models;

public class Carro extends Veiculo {
     //atributos
     public boolean motorEletrico;
     public boolean motorFlex;
     public boolean motorDiesel;
     public boolean motorGasolina;
     public boolean motorEtanol;


     public Carro() {
          
     }



     public void exibirDados() {
          super.exibirDados();
          if (motorEletrico == true) {
               System.out.println("motor eletrico");
               
          }
          if(motorFlex == true) {
               System.out.println("motor:Flex");
          }
          if (motorDiesel == true) {
               System.out.println("motor:Diesel");

               System.out.println("motor:Gasolina");

               System.out.println("motor Etanol");
          }
     }

}
