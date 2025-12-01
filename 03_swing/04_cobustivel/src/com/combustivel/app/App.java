package com.combustivel.app;

import javax.swing.JOptionPane;

import com.combustivel.models.Combustivel;
public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel();

        //Array
        String[] opcoes = {" informar valores", "Sair do progarama"};
        Object opcao;

        do{

            //Entrada de dados
            opcao = JOptionPane.showInputDialog(
                null,
                "Selecione uma opção:",
                "Combustivel:",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                 opcoes[0]
                 );

       
         if(opcao != "Sair do programa") {

             combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("informe o valor da gasolina").replace(",", ".")));
             combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("informe o valor do etanol").replace(",",".")));
             
             //saída de dados
             JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());
            }
        } while (opcao != "Sair do programa");
    }
}
