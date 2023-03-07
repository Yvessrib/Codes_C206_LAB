package org.example;

public class Main {
    
    // Composição
    public static void main(String[] args){

        Nave n1 = new Nave("Falcon", 500, false, "Fogo", 50);
        n1.MostraInfo();
    }

    /* Agregação
    public static void main(String[] args) {

        Arma a1 = new Arma("Fogo", 300);
        Nave n1 = new Nave("Falcon", 500, false);

        n1.addArma(a1);
        n1.MostraInfo();
    }
     */

}