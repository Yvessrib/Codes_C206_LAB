package org.example;

public class Jogo {

    String nome;
    String genero;
    Double preco;
    Boolean dlc;

    public Jogo(String nome, String genero, Double preco, Boolean dlc) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
    }

    public void mostraInfo(){
        System.out.println("--- Info Jogo ---");
        System.out.println("Jogo: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Preco: R$ " + preco);
        if(dlc)
            System.out.println("Possui DLC");
        else
            System.out.println("Não possui DLC");
    }
}
