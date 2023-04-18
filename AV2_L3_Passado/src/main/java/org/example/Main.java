package org.example;

public class Main {
    public static void main(String[] args) {

        Jogador j1 = new Jogador("Yves", 2, true, 50, 75);
        Jogador j2 = new Jogador("Giovana", 3, false, 25, 100)
        Bot bot1 = new Bot("Arthur",true);
        Bot bot2 = new Bot("Barbara", false);

        Skin skin1 = new Skin("Homem de ferro", "Comum");
        Skin skin2 = new Skin("Batman", "Épica");

        Mochila moch1 = new Mochila("Raro");
        Mochila moch2 = new Mochila("Comum");

        j1.skin = skin1;
        j2.skin = skin2;

        j1.mochila = moch1;
        j2.mochila = moch2;

        j1.mostraInfo();

    }
}