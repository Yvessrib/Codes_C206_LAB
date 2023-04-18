package org.example;

public class SUV extends Carro{

    private int tracao;

    public SUV(double valor, String cor, int ano, int tracao) {
        super(valor, cor, ano);
        this.tracao = tracao;
    }

    @Override
    public void taxa() {
        System.out.println("Hacht está taxado");
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do SUV ---");
        System.out.println("Valor: " + getValor());
        System.out.println("Cor: " + getCor());
        System.out.println("Ano: " + getAno());
        System.out.println("Tracao: " + tracao);
    }
}
