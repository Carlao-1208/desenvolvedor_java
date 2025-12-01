package com.heranca.models;

public class PessoaJuridica extends Pessoa {
    //atirbutos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;


    public PessoaJuridica(String razaosocial,String nomeFantasia,
    String cnpj, String email, String telefone);{
    this.razaoSocial = razaoSocial;
    this.nomeFantasia = nomeFantasia;
    this.cnpj = cnpj;

    public void exibirDados() {
        System.out.println("razão social:" + this.razaoSocial);
        System.out.println("Nome da empresa:" + this.cnpj);
        super.exibirDados();
    }

    }

}
