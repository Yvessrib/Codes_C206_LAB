package org.example;

public class Plataforma {

    String nome;
    String criador;
    Jogo[] jogos = new  Jogo[100];

    public void mostraInfo(){
        System.out.println("--- Info Plataforma ---");
        System.out.println("Plataforma: " + nome);
        System.out.println("Criador: " + criador);
        System.out.println("Jogos: ");
        for(int i = 0; i < jogos.length; i++){8
            if(jogos[i] != null){
                jogos[i].mostraInfo();
            }
        }
    }

    public void adicionarJogo(Jogo jogo){
        for(int i = 0; i < jogos.length; i++) {
            if (jogos[i] == null) {
                jogos[i] = jogo;
                break;
            }
        }
    }

    public void mostrarMaisCaroBarato(){

        int Ibarato = 0;
        int Icaro = 0;

        for(int i = 0; i < jogos.length; i++){
            if(jogos[i] != null) {
                if(jogos[i].preco >= Icaro){
                    Icaro = i;
                }

                if(jogos[i].preco <= Ibarato){
                    Ibarato = i;
                }
            }
        }

        System.out.println("Jogo com maior preço: " + jogos[Icaro].nome);
        System.out.println("Jogo com menor preço: " + jogos[Ibarato].nome);
    }

    public void calculaDlc(){

        int qnt = 0;

        for(int i = 0; i < jogos.length; i++){
            if (jogos[i] != null) {
                if(jogos[i].dlc){
                    qnt++;
                }
            }
        }

        System.out.println( qnt + " possuem DLC's");
    }


}
