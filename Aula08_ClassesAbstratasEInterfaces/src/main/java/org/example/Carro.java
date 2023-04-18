package org.example;

public abstract class Carro implements Controle{

    private double Valor;
    private String cor;
    private int ano;

    public Carro(double valor, String cor, int ano) {
        Valor = valor;
        this.cor = cor;
        this.ano = ano;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
