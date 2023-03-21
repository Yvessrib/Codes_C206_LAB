package project;

public class Fabricante {

    String nome;
    String cnpj;

    public Fabricante(String nome, String cnpj) {

        this.nome = nome;
        this.cnpj = cnpj;

    }

    void mostraInfo() {

        System.out.println("-- INFORMAÇÕES DO FABRICANTE --");
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println();

    }
    
}