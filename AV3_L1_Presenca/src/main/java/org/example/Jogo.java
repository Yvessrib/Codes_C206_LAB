package org.example;

public class Jogo implements Comparable <Jogo>{

    private String nome;
    private double preco;
    private String genero;

    public Jogo(String nome, double preco, String genero) {
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    public Jogo() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(Jogo o) {
        return Double.compare(this.preco,o.preco);
    }
}
