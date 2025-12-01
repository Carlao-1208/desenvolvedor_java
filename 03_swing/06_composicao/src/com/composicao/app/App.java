package com.composicao.app;

import javax.swing.JOptionPane;
import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa motorista = new Pessoa();
        Veiculo carro = new Veiculo();

        // entrada de dados do motorista
        motorista.setNome(JOptionPane.showInputDialog("informe o nome do motorista"));
        motorista.setCpf(JOptionPane.showInputDialog("informe o cpf do motorista"));
        motorista.setTelefone(JOptionPane.showInputDialog("informe o telefone do motorista"));

        //enrada de dados do veiculo
        carro.setMarca(JOptionPane.showInputDialog("Ifomrme a marca do carro"));
        carro.setModelo(JOptionPane.showInputDialog("Ifomrme o modelo do carro"));
        carro.setAno(JOptionPane.showInputDialog("Ifomrme o ano do carro"));
        carro.setCor(JOptionPane.showInputDialog("Ifomrme a cor do carro"));
        carro.setPlaca(JOptionPane.showInputDialog("Ifomrme a placa do carro"));

        carro.setProprietario(motorista);

        //saída de dados
        JOptionPane.showMessageDialog(
            null,
             "Marca:" + carro.getMarca() +
             "\nModelo:" + carro.getModelo() +
             "\nCor:" + carro.getCor() +
             "\nPlaca:" + carro.getPlaca() +
             "\nDono do veiculo:" + carro.getProprietario().getNome()+
             "\nCPF do dono veiculo:" + carro.getProprietario().getCpf() +
             "\nTelefone do dono do veiculo:" + carro.getProprietario().getTelefone()
             
             );
        
    }
}
