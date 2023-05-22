package org.example;

public class ThreadContadora extends Thread{

    String nomeOVelha;
    int velocidade;

    public ThreadContadora(String nomeOVelha, int velocidade) {
        this.nomeOVelha = nomeOVelha;
        this.velocidade = velocidade;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println((i*10) + "% carregado");
            System.out.println(this.nomeOVelha + " deu " + i + " pulos");

            try{
                Thread.sleep(this.velocidade);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
