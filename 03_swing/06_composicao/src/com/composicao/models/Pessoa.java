package com.composicao.models;

public class Pessoa {
    //atirubutos 
    private String nome;
    private String cpf;
    private String telefone;

    //construtor
    public Pessoa() {

    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}
