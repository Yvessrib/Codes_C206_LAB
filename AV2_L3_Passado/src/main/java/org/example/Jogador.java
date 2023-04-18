package org.example;

public class Jogador extends Pessoa implements Recuperar, Loja{

    private int nivel;
    private boolean passeBatalha;
    private int vida;
    private int escudo;
    Skin skin = null;
    Mochila mochila = null;

    public Jogador(String nome, int nivel, boolean passeBatalha, int vida, int escudo) {
        super(nome);
        this.nivel = nivel;
        this.passeBatalha = passeBatalha;
        this.vida = vida;
        this.escudo = escudo;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Nível: " + nivel);
        System.out.println("Passe de batalha: " + passeBatalha);
        System.out.println("Vida: " + vida);
        System.out.println("Escudo: " + escudo);
        if(mochila != null){
            System.out.println("Raridade da mochila: " + mochila.getRaridade());
        }
        else
            System.out.println("O Jogador não possui mochila");

        if(skin != null){
            System.out.println("Nome da skin: " + skin.getNome());
            System.out.println("Raridade da skin: " + skin.getRaridade());
        }
        else
            System.out.println("O Jogador não possui skin");
    }


    @Override
    public void fazMissao() {
        System.out.println(getNome() +  " completou uma missão!");
        nivel++;
    }

    @Override
    public void gastarVbucks() {
        System.out.println("Gastou V Bucks na loja");
    }

    @Override
    public void comprarVbucks() {
        System.out.println("Comprou V Bucks na loja");
    }

    @Override
    public void recuperarVida() {
        if(vida >= 100)
            vida = 100;
        else
            vida += 15;

    }

    @Override
    public void recuperarEscudo() {
        if(escudo >= 100)
            escudo = 100;
        else
            escudo += 25;
    }
}
