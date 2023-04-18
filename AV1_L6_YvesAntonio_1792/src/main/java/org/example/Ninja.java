package org.example;

public class Ninja {

    //Criando variáveis de informação do ninja
    String nome;
    int idade;
    String titulo;
    String ranking;

    //Construtor para facilitar criação
    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    //Metodo de mostrar informações
    public void mostraInfo(){
        System.out.println("--- Ninja ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Titulo: " + titulo);
        System.out.println("Ranking: " + ranking);
        System.out.println("-------------");
    }
}
