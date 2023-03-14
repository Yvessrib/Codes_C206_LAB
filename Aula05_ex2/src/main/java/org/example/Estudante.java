package org.example;

public class Estudante {

    String nome;
    int idade;
    String ano;

    public Estudante(String nome, int idade, String ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano = ano;
    }

    public void mostraInfo(){

        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Idade do aluno: " + this.idade);
        System.out.println("Ano do aluno " + this.ano);
        System.out.println("----------------------");
    }
}
