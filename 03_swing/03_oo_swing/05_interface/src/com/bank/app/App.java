package com.bank.app;

import javax.swing.JOptionPane;

import com.bank.models.Conta;

public class App {
    public static void main(String[] args) throws Exception {
       Conta cc = new Conta(null, null, "1234-5", "12345-6", 0.0);

       String[] opcoes = {
        "Consultar dados",
        "Depositar",
        "Sacar",
        "Sair"
       };
       Object opcao;

       double valor;

       cc.setTitular(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
       cc.setCpf(JOptionPane.showInputDialog("informe o cpf do titular da conta"));

       do{
        opcao = JOptionPane.showInputDialog(
            null,
            "Escolha a opção desejada"  ,
            null,
            JOptionPane.QUESTION_MESSAGE,
          null,
          opcoes,
          
          opcoes[0]
           );

           if (opcao == "Consultar dados") {
            JOptionPane.showMessageDialog(null, cc.consultarDados());
           }
           else if (opcao == "Depositar") {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito em R$:").replace("," , "."));
            JOptionPane.showMessageDialog(
                null,
                 "Depósito efetuado com sucesso." +
                 "\nValor do saldo: R$" +
                 String.format("%.2f", cc.depositar(valor))
                 );


           }
           else if (opcao == "Sacar") {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque em R$: ").replace("," ,"."));
            if (cc.getSaldo() >= valor){
                JOptionPane.showMessageDialog(
                null,
                "Saque efetuado com sucesso." +
                "\nValor do saldo: R$" + String.format("%.2f" , cc.sacar(valor))
                  
                   );
            }
            else{
                JOptionPane.showMessageDialog(
                    null,
                     "Saldo insuficiente." +
                     "\nSaldo atual: R$" +
                     String.format("%.2f", cc.getSaldo()));
            }
           }
       } while (opcao != "Sair");

    }
}
