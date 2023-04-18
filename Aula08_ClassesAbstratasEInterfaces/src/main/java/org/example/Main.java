package org.example;

public class Main {
    public static void main(String[] args) {

        Carro[] carros = new Carro[5];

        SUV suv = new SUV(230000,"Preto",2020,16);
        Sedan sedan = new Sedan(160000,"Azul",2018,1);
        Hatch hatch = new Hatch(120000, "Branco", 2019, 4);

        carros[0] = suv;
        carros[1] = sedan;
        carros[2] = hatch;

        for(int i = 0; i < carros.length; i++){

            if(carros[i] != null){

                if(carros[i] instanceof SUV){
                    SUV su = (SUV) carros[i];
                    su.taxa();
                    su.mostraInfo();
                }
                if(carros[i] instanceof Sedan){
                    Sedan se = (Sedan) carros[i];
                    se.taxa();
                    se.mostraInfo();
                }
                if(carros[i] instanceof Hatch){
                    Hatch h = (Hatch) carros[i];
                    h.taxa();
                    h.mostraInfo();
                }
            }
        }

    }
}