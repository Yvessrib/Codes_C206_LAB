package org.example;

public class Plataforma {

    String nome;
    Serie[] series = new Serie[100];

    public void mostraInfo() {
        System.out.println("Plataforma: " + nome);

        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                series[i].mostraInfo();
            }
        }
    }

    public void addSerie(Serie serie) {
        for (int i = 0; i < series.length; i++) {
            if (series[i] == null) {
                series[i] = serie;
                System.out.println("Serie adicionada com sucesso!");
                break;
            }
        }
    }

    public String serieMaisLongaFinalizada(){

        int maiorTemp = 0;
        boolean finalizada = false;

        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                if(series[i].finalizada){
                    if(series[i].temporadas >= maiorTemp){
                        maiorTemp = i;
                        finalizada = true;
                    }
                }
            }
        }

        if(finalizada){
            return series[maiorTemp].nome;
        }
        else
            return "Nenhuma série finalizada no sistema";
    }

    public void mediaPorcentagem(){

        int serieTotal = 0;
        int serieAvaliada = 0;
        int somaAvaliacao = 0;

        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                serieTotal++;

                if(series[i].temporadas >= 3){
                    serieAvaliada++;
                    somaAvaliacao += series[i].nota;
                }
            }
        }

        System.out.println("Porcentagem de séries com 3 ou mais temporadas: " + (serieAvaliada/serieTotal)*100);
        System.out.println("Media de avaliação dessa séries: " + somaAvaliacao/serieAvaliada);


    }
}
