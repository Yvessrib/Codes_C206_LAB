package org.example;

public abstract class Personagem {

    static int cont = 0;
    private String nome;
    private int id;
    private int poder;

    public Personagem(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;
        this.id =
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Poder: " + poder);
    }

    abstract void travarBatalha();

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
