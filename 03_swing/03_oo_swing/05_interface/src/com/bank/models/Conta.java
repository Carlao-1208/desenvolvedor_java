package com.bank.models;

import com.bank.repository.IConta ;
public class Conta implements IConta {
    //atributos da classe
    private String titular;
    private String cpf;
    private String agencia;
    private String nConta;
    private double saldo;


    public Conta() {
    }


    public Conta(String titular, String cpf, String agencia, String nConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }


    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String consultarDados() {
        return "DADOS DA CONTA:\nNome: " + this.titular +
        "\nCPF " + this.cpf +
        "\n Numero da agenencia:" + this.agencia +
        "\nNumero da conta:" + this.agencia + "\nnumero da conta:" + this.nConta + "\nSaldo: R$" + String.format("%.2f", this.saldo);

    }
       

    @Override
    public double depositar(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    @Override
    public double sacar(double valor) {
        this.saldo -= valor;
        return this.saldo;

    
    }


}
