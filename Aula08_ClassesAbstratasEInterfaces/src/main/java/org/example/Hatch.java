package org.example;

public class Hatch extends Carro{

    private int portas;

    public Hatch(double valor, String cor, int ano, int portas) {
        super(valor, cor, ano);
        this.portas = portas;
    }

    @Override
    public void taxa() {
        System.out.println("Hacht está taxado");
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do Sedan ---");
        System.out.println("Valor: " + getValor());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAno());
        System.out.println("portas: " + portas);
    }
}
