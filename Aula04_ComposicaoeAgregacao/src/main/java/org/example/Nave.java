package org.example;

public class Nave {

    String nome;
    int velocidade;
    boolean velocidadeDaLuz;
    Arma arma;

    public Nave(String nome, int velocidade, boolean velocidadeDaLuz) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.velocidadeDaLuz = velocidadeDaLuz;
        this.arma = arma;
    }

    public void MostraInfo(){
        System.out.println("Nome da Nave: " + this.nome);
        System.out.println("Velocidade da Nave: " + this.velocidade);
        System.out.println("Tipo da arma: " + this.arma.tipoarma);
        System.out.println("Forca da arma " + this.arma.forca);
    }

    public void ViajarVelocidadedaLuz(){
        if(this.velocidadeDaLuz == true){
            System.out.println("Viaja em velocidade da luz");
        }
        else
            System.out.println("Nao viaja na velocidade da luz");
    }

    public void addArma(Arma arma){
        System.out.println("Arma foi adicionada!");
        this.arma = arma;
    }
}
