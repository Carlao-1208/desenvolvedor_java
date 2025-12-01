package com.combustivel.models;

public class Combustivel {
    //atributos
    private double gasolina;
    private double etanol;

    public Combustivel() {
    }

    public double getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double getEtanol() {
        return this.etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    public String calcularCombustivel() {
        return (this.etanol >= this.gasolina*0.7) ? "Melhor abastecer com gasolina." : "Melhor abastecer com etanol.";
    }

}
