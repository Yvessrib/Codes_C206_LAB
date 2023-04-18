package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //int [] arrayInt = {10,20,30,40,50,60,70,80,90,100};
        //System.out.println(arrayInt[2]);

        Scanner in = new Scanner(System.in);

        //Declarando array de instâncias
        Livro [] livros = new Livro[10];

        Biblioteca b1 = new Biblioteca();
        b1.nome = "Bilac Pinto";

        boolean flag = true;

        while(flag){1
            System.out.println("BEM VINDO AO MENU DA BIBLIOTECA: " + b1.nome);
            System.out.println("1 - Cadastrar novo livro");
            System.out.println("2 - Mostrar informacoes livros");
            System.out.println("3 - Sair do menu");

            int op;
            op = in.nextInt();

            switch (op){

                case 1:
                    System.out.println("CADASTRE UM NOVO LIVRO!");
                    in.nextLine();

                    System.out.println("Entre com o nome do livro: ");
                    String nomeLivro = in.nextLine();

                    System.out.println("Entre com a quantidade de paginas: ");
                    int qtdpag = in.nextInt();

                    Livro l = new Livro(nomeLivro, qtdpag);

                    b1.addLivro(l);

                    System.out.println("Livro adicionado");
                    break;
                case 2:
                    b1.mostraInfo();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Entre com um numero valido");
                    break;
            }


        }

        /*
        //1º método de criar
        Livro l1 = new Livro("Diario de um banana", 300);
        livros[0] = l1;

        //2º método de criar
        livros[1] = new Livro("Jogos Vorazes", 400);
        livros[2] = new Livro("Princesa Mecânica", 500);
        livros[3] = new Livro("Corrente de ouro", 600);


        //Como sair com os dados
        for (int i = 0; i < livros.length; i++){
            if(livros[i] != null) {
                System.out.println(livros[i].nome);
                System.out.println(livros[i].numpags);
            }
        }


        //Usando métdo para mostrarInfo
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null) {
                livros[i].mostraInfo();
            }
        }
         */


    }
}