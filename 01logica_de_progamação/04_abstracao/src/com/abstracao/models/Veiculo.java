package com.abstracao.models;

abstract public class  Veiculo {
    // atributos
    public String fabricante;
    public String modelo;
    public String ano;
    public String cor;
    public String placa;

    public Veiculo(String fabricante, String modelo, String ano, String cor, String placa) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public Veiculo() {
        
    }

    public void exibirDados(){
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("modelo: " + this.modelo);
        System.out.println("ano: " + this.ano);
        System.out.println("cor: " + this.cor);
        System.out.println("placa: " + this.placa);
    }

    

}
