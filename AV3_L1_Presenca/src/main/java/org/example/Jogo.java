package org.example;

//Implementando a comparação
public class Jogo implements Comparable <Jogo>{

    //Atributos dos Jogos
    private String nome;
    private double preco;
    private String genero;

    //Construtor om os atributos
    public Jogo(String nome, double preco, String genero) {
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    //Construtor sem os atributos
    public Jogo() {
    }

    //Getters e setters
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

    //Criando comparação por preço, em ordem crescente de valores
    @Override
    public int compareTo(Jogo o) {
        return Double.compare(this.preco,o.preco);
    }
}
