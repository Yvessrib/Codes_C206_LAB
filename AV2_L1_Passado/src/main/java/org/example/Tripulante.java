package org.example;

public class Tripulante extends Astronauta implements Missao{

    private int qtdMissoes;

    public Tripulante(String cor, String nome, int qtdMissoes) {
        super( cor, nome);
        this.qtdMissoes = qtdMissoes;
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do Tripulante ---");
        super.mostraInfo();
    }

    @Override
    public void reportar() {
        System.out.println(getNome() + " reportou um corpo");
    }

    @Override
    public void reparar() {
        System.out.println(getNome() + " fez um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(getNome() + " fez uma missão");
        qtdMissoes--;
    }

    public int getQtdMissoes() {
        return qtdMissoes;
    }
}
