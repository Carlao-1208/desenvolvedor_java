package com.bank.repository;

public interface IConta {
    public String consultarDados();
    public double depositar(double valor);
    public double sacar (double valor);

}
