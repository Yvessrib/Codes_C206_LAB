package org.example;

public class Sith extends Personagem implements Forca{

    private boolean darth;
    private Sabre sabre;

    public Sith(String nome,int poder, boolean darth, Sabre sabre) {
        super(nome,poder);
        this.darth = darth;
        this.sabre = sabre;
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do Sith ---");
        super.mostraInfo();
        if(darth)
            System.out.println("Esse sith é um Darth");
        else
            System.out.println("Esse sith não é um Darth");
        System.out.println("Cor do sabre: " + sabre.cor);
    }

    @Override
    void travarBatalha() {
        System.out.println(getNome() + " travou uma batalha contra um jedi");
        setPoder(getPoder() + 1);
    }

    public void corromperJedi(){
        if(darth && getPoder()>=60)
            System.out.println(getNome() + " levou um jedi para o lado negro da força");
        else
            System.out.println(getNome() + " ainda não consegue corromper jedis");
    }

    @Override
    public void usarForca() {
        System.out.println(getNome() + " usou o lado negro da força");
        setPoder(getPoder() + 3);
    }

    @Override
    public void trocarSabre(String cor) {
        sabre.cor = cor;
    }
}
