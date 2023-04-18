package org.example;

public class Main {
    public static void main(String[] args) {

        Tripulante t1 = new Tripulante("Azul","Yves",10);
        Tripulante t2 = new Tripulante("Roxo", "Victor", 9);
        Tripulante t3 = new Tripulante("Rosa", "Marina", 8);

        Impostor i1 = new Impostor("Vermelho", "Giovana");
        Impostor i2 = new Impostor("Verde", "José");

        Pet pet1 = new Pet("Raj rajado");
        Pet pet2 = new Pet("Ximango");

        Skin skin1 = new Skin("Enfermeio");
        Skin skin2 = new Skin("Sexta feira 13");

        t1.skin = skin1;
        t3.skin = skin2;

        t1.pet = pet1;
        t2.pet = pet2;

        t1.mostraInfo();
        t2.mostraInfo();
        t3.mostraInfo();

        i1.mostraInfo();
        i2.mostraInfo();

        t1.reparar();
        t2.fazerMissao();
        t3.reportar();
        t1.verCameras();
        t2.fazerMissao();

        i1.executar();
        i1.fazerMissao();
        i1.sabotarComunicacao();
        i2.sabotarLuz();
        i2.sabotarOxigenio();
        i2.usarVentoinha();
        i1.reparar();
        i2.reportar();

    }
}