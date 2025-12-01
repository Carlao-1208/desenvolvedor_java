package com.construtor.models;

public class Pessoa {
    //atributos
    public String nome;
    public String CPF;
    public String email;
    public String telefone;
    public int idade;

    public Pessoa(String nome, String CPF, String email, String telefone, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String apresentar() {
            return "olá meu nome é " + this.nome + ", tenho" + this.idade + "anos. meu e-mail é" +this.email + ", meu telefone é" this.telefone + "e meu CPF é" + this.cpf + ".";
            
        }

}
