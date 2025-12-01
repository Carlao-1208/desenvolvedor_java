package com.objeto.app;

import javax.swing.JOptionPane;

import com.objeto.models.Pessoa;


public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa();

        //entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("Informe seu nome"));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));
        usuario.setCpf(JOptionPane.showInputDialog("informe o e-mail:"));
        usuario.setTelefone(JOptionPane.showInputDialog("informe o telefone"));

        //Saida de dados
        JOptionPane.showMessageDialog(
            null,
            "Dados do usuario:\nNome:" + usuario.getNome() +
            "\nIdade: " + usuario.getIdade() +
            "\nCPF:" + usuario.getCpf() + 
            "\nE-mail:" + usuario.getEmail() +
            "\nTelefone:" + usuario.getTelefone()
            );
    }
}
