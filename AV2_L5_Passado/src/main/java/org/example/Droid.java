package org.example;

public class Droid extends Personagem{

    private boolean hostil;

    public Droid(String nome,int poder, boolean hostil) {
        super(nome,poder);
        this.hostil = hostil;
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do Droid ---");
        super.mostraInfo();
        if(hostil)
            System.out.println("Esse droid é hostil");
        else
            System.out.println("Esse droid não é hostil");
    }

    public void hackearSistema(){
        System.out.println(getNome() + " hackeou o sistema da nave");
    }

    @Override
    void travarBatalha() {
        if(hostil){
            System.out.println(getNome() + " travou uma batalha contra um sith");
        }else{
            System.out.println(getNome() + " travou uma batalha contra um jedi");
            setPoder(getPoder() + 1);
        }
    }
}
