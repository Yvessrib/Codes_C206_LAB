package org.example;

public class Impostor extends Astronauta implements Missao, Sabotar, Executar{

    private int qtdMortes = 0;

    public Impostor(String cor, String nome) {
        super(cor, nome);
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do Impostor ---");
        super.mostraInfo();
    }

    @Override
    public void reportar() {
        System.out.println(getNome() + " fez um self report");
    }

    @Override
    public void reparar() {
        System.out.println(getNome() + " fingiu que fez um reparo");
    }

    @Override
    public void fazerMissao() {
        System.out.println(getNome() + " fez uma tarefa falsa");
    }

    public void usarVentoinha(){
        System.out.println("O importor se escondeu na ventilação");
    }

    public void trancarPortas(String local){
        System.out.println("A porta do(a) " + local + " foi trancada");
    }

    @Override
    public void executar() {
        System.out.println(getNome() + " matou um tripulante");
        qtdMortes++;
    }


    @Override
    public void sabotarLuz() {
        System.out.println("O impostor sabotou a luz");
    }

    @Override
    public void sabotarOxigenio() {
        System.out.println("O impostor sabotou o oxigenio");
    }

    @Override
    public void sabotarReator() {
        System.out.println("O impostor sabotou o reator");

    }

    @Override
    public void sabotarComunicacao() {
        System.out.println("O impostor sabotou a comunicacao");
    }

    public int getQtdMortes() {
        return qtdMortes;
    }
}
