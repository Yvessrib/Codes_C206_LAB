package org.example;

public abstract class Pessoa {

    public static int qtdPessoa;
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
    }

    public abstract void fazMissao();

    public String getNome() {
        return nome;
    }
}
