package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        Plataforma plat = new Plataforma();
        plat.nome = "Netflix";

        System.out.println("--- Bem vindo a " + plat.nome + " ---");

        while (flag){

            System.out.println("--- Menu ---");
            System.out.println("1 - Mostrar info da plataforma e séries");
            System.out.println("2 - Adicionar uma serie");
            System.out.println("3 - Serie mais longa finalizada");
            System.out.println("4 - Porcentagem das series com 3 ou mais avaliações e media das avaliações destas");
            System.out.println("5 - Sair do sistema");

            System.out.print("Opção: ");
            int op = sc.nextInt();
            System.out.println();

            switch (op){

                case 1:
                    System.out.println("Você escolheu: Mostrar info da plataforma e séries");
                    plat.mostraInfo();
                    break;
                case 2:
                    System.out.println("Você escolheu: Adicionar uma série");
                    sc.nextLine();

                    System.out.print("Entre com o nome da série: ");
                    String nome = sc.nextLine();

                    System.out.print("Entre com a nota da série: ");
                    double nota = sc.nextDouble();

                    System.out.print("Entre com o número de temporadas: ");
                    int temp = sc.nextInt();

                    System.out.print("A série ja foi finalizada: ");
                    boolean fim = sc.nextBoolean();
                    sc.nextLine();

                    System.out.print("Entre com o nome do diretor da série: ");
                    String direxNome = sc.nextLine();

                    Serie serie = new Serie(nome,nota,temp,fim,direxNome);
                    plat.addSerie(serie);
                    break;

                case 3:
                    System.out.println("Você escolheu: Serie mais longa finalizada");
                    System.out.println(plat.serieMaisLongaFinalizada());
                    break;
                case 4:
                    System.out.println("Você escolheu: Porcentagem das series com 3 ou mais avaliações e media das avaliações destas");
                    plat.mediaPorcentagem();
                    break;
                case 5:
                    System.out.println("Você escolheu: Sair do sistema");
                    flag = false;
                    break;
                default:
                    System.out.println("Entre com um valor válido");
                    break;
            }
        }
    }
}