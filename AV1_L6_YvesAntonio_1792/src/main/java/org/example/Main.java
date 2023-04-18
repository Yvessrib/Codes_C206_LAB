package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //AV1 - C206-L6 - 2023.1
        //Yves Antônio - 1792 - GEC

        //Criando o a entrada
        Scanner sc = new Scanner(System.in);

        //Criando flag para o menu
        boolean flag = true;

        //Instanciado aldeia
        Aldeia ald = new Aldeia("Aldeia da Folha", 200,"Kanto");

        //Entrando no menu
        System.out.println("--- Bem vindo a " + ald.nome + " ---");
        while (flag){
            //Opções do switch
            System.out.println("--- MENU ---");
            System.out.println("1 - Mostrar informações da aldeia e ninjas");
            System.out.println("2 - Adicionar um ninja");
            System.out.println("3 - Nome dos ninjas rank S");
            System.out.println("4 - Quantidade de ninjas por título");
            System.out.println("5 - Sair do menu");

            //Entrando com a opção
            System.out.print("Opção: ");
            int op = sc.nextInt();

            System.out.println();

            switch (op){
                case 1: //Infos aldeia
                    System.out.println("Você selecionou: Mostrar info da aldeia e ninjas");
                    ald.mostraInfo(); //Usando método
                    break;
                case 2: //Adicionar ninja
                    System.out.println("Você selecionou: Adicionar ninja");
                    sc.nextLine();

                    System.out.print("Entre com o nome do ninja: ");
                    String nome = sc.nextLine(); //Nome do ninja

                    System.out.print("Entre com a idade do ninja: ");
                    int idade = sc.nextInt(); //Idade do ninja
                    sc.nextLine();

                    System.out.print("Entre com o titulo do ninja: ");
                    String titulo = sc.nextLine(); //Titulo do ninja

                    System.out.print("Entre com o ranking do ninja: ");
                    String ranking = sc.nextLine(); //Ranking do ninja

                    //Criando o ninja
                    Ninja ninja = new Ninja(nome,idade,titulo,ranking);
                    //Adicionando ninja a aldeia
                    ald.adicionarNinja(ninja);
                    break;
                case 3: //Nome dos ninjas ranking S
                    System.out.println("Você escolheu: Nome dos ninjas rank S");
                    ald.rankingS(); //Usando metodo
                    break;
                case 4: //Quantidade de ninjas por titulo
                    System.out.println("Você escolheu: Quantidade de ninjas por título: ");
                    ald.qtdTitulos(); //Usando metodo
                    break;
                case 5: //Saindo do sistema
                    System.out.println("Você escolheu: Sair do menu!");
                    System.out.println("Até a próxima Hokage!");
                    flag = false; //Flag = false pra sair do menu
                    break;
                default: //Default
                    System.out.println("Entre com uma opção válida!");
                    System.out.println();
                    break;
            }
        }


    }
}