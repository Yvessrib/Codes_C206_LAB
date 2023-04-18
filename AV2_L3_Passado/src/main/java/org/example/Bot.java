package org.example;

public class Bot extends Pessoa implements Interacao{

    boolean hostil;

    public Bot(String nome, boolean hostil) {
        super(nome);
        this.hostil = hostil;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Hostil: " + hostil);
    }

    @Override
    public void fazMissao() {
        if(hostil){
            System.out.println("Atrapalhou a fazer a missão");
        }
        else
            System.out.println("Ajudou o jogador a fazer a missão");
    }

    @Override
    public void passarMissao() {
        if(hostil){
            System.out.println("Este Bot não passa missões");
        }
        else
            System.out.println("este Bot passa missões!");
    }
}
