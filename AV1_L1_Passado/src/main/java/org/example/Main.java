package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        Plataforma plat = new Plataforma();
        plat.criador = "Yves";
        plat.nome = "PlayStore";

        System.out.println("--- Bem vindo a " + plat.nome + " ---");

        while (flag){

            System.out.println("--- MENU ---");
            System.out.println("1 - Mostrar info da plataforma e jogos");
            System.out.println("2 - Adicionar um jogo");
            System.out.println("3 - Mostrar jogo mais caro e barato");
            System.out.println("4 - Jogos com DLC");
            System.out.println("5 - Sair do sistema");

            System.out.println("Opção: ");
            int op = sc.nextInt();

            System.out.println();


            switch (op){

                case 1:
                    System.out.println("Você selecionou: Mostrar info da plataforma!");
                    plat.mostraInfo();
                    break;
                case 2:
                    System.out.println("Você selecionou: Adicionar um jogo");
                    sc.nextLine();

                    System.out.print("Entre com o nome do jogo: ");
                    String nome = sc.nextLine();

                    System.out.print("Entre com o gênero do jogo: ");
                    String genero = sc.nextLine();

                    System.out.print("Entre com o preço do jogo: ");
                    double preco = sc.nextInt();

                    System.out.print("Entre se o jogo possui DLC ou não: ");
                    boolean dlc = sc.nextBoolean();

                    Jogo jogo = new Jogo(nome,genero,preco,dlc);
                    plat.adicionarJogo(jogo);
                    break;
                case 3:
                    System.out.println("Você selecionou: Mostrar jogo mais caro e jogo mais barato");
                    plat.mostrarMaisCaroBarato();
                    break;
                case 4:
                    System.out.println("Você selecionou: Mostrar quantidade de jogos com DLC");
                    plat.calculaDlc();
                    break;
                case 5:
                    System.out.println("Você selecionou: Sair do sistema");
                    flag = false;
                    break;
                default:
                    System.out.println("Entre com uma opção valida");
                    break;
            }
        }
    }
}