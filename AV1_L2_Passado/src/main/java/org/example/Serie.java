package org.example;

public class Serie {

    String nome;
    double nota;
    int temporadas;
    boolean finalizada;
    Diretor diretor;

    public Serie(String nome, double nota, int temporadas, boolean finalizada, String nomeDirex) {
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        this.diretor = new Diretor(nomeDirex);
    }

    public void mostraInfo(){
        System.out.println("--- Série ---");
        System.out.println(nome);
        System.out.println("Avaliação " + nota + "/5");
        System.out.println("Temporadas: " + temporadas);
        if(finalizada)
            System.out.println("Status: Completa");
        else{
            System.out.println("Status: Incompleta");
        }
        System.out.println("Diretor: " );
    }
}
