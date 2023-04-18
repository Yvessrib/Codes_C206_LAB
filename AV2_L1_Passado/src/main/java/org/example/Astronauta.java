package org.example;

public abstract class Astronauta {

    static int cont = 0;
    private String cor;
    private String nome;
    Skin skin = null;
    Pet pet = null;

    public Astronauta(String cor, String nome) {
        cont++;
        this.cor = cor;
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Nome: " + this.nome);
        if(skin != null)
            System.out.println("Tipo da skin: " + skin.getTipo());
        else
            System.out.println("Não possui skin");
        if(pet != null)
            System.out.println("Nome do pet: " + pet.getNome());
        else
            System.out.println("Não possui pet");
    }

    public void verCameras(){
        System.out.println(nome + " olhou as câmeras");
    }

    public abstract void reportar();

    public abstract void reparar();

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }
}
