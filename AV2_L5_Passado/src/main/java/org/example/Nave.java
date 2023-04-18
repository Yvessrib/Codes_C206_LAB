package org.example;

public class Nave {

    private String nome;
    Personagem[] personagens = new Personagem[10];
    private boolean velocidadeLuz;

    public Nave(String nome, boolean velocidadeLuz) {
        this.nome = nome;
        this.velocidadeLuz = velocidadeLuz;
    }

    public void mostraInfo(){
        System.out.println("--- Infos da Nave ---");
        System.out.println("Nome: " + nome);
        if (velocidadeLuz)
            System.out.println("Possui velocidade da luz");
        else
            System.out.println("Não possui velocidade da luz");

        System.out.println("--- Infos dos Personagens ---");
        for(int i = 0; i< personagens.length; i++){
            System.out.println("Info");
        }
    }
}
