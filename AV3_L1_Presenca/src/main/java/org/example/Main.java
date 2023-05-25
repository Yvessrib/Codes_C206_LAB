package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc =  new Scanner (System.in);
        Boolean flag = true;
        Arquivo arquivo = new Arquivo();
        ArrayList<Jogo> jogosArray = new ArrayList<>();

        while(flag){
            System.out.println("--- MENU ---");
            System.out.println("1 - Adicionar Jogo no Arquivo");
            System.out.println("2 - Mostrar informações do Arquivo");
            System.out.println("3 - Ordenar jogos em ordem crescente de preço");
            System.out.println("4 - Ordenar jogos em ordem decrescente de preço");
            System.out.println("5 - Sair do Menu");

            int op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("--- Adicionando Jogo ---");
                    System.out.print("Entre com o nome do Jogo: ");
                    sc.nextLine();
                    try {

                        String nome = sc.nextLine();

                        System.out.print("Entre com o preço do Jogo: ");
                        double preco;

                        preco = sc.nextDouble();

                        if (preco > 0) {

                        }else {
                            throw new PrecoNegativoException("Preço inválido!");
                        }

                        System.out.print("Entre com o gênero do Jogo: ");
                        sc.nextLine();
                        String genero = sc.nextLine();

                        Jogo j1 = new Jogo(nome, preco, genero);
                        arquivo.escrever(j1);
                        jogosArray.add(j1);
                        System.out.println("Jogo adicionado com sucesso!");

                    } catch (PrecoNegativoException e) {
                        System.out.println("Preço inválido! Tente denovo.");
                        break;
                    }
                    break;

                case  2:
                    ArrayList<Jogo> jogos = arquivo.ler();
                    System.out.println("--- Lista de Jogos ---");
                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.println("Nome do jogo: " + jogos.get(i).getNome());
                        System.out.println("Preco do jogo: " + jogos.get(i).getPreco());
                        System.out.println("Genero do jogo: " + jogos.get(i).getGenero());
                        System.out.println("-------------------");
                    }
                    break;
                case 3:
                    Collections.sort(jogosArray);
                    System.out.println("--- Lista de Jogos ---");
                    for (int i = 0; i < jogosArray.size(); i++) {
                        System.out.println("Nome do jogo: " + jogosArray.get(i).getNome());
                        System.out.println("Preco do jogo: " + jogosArray.get(i).getPreco());
                        System.out.println("Genero do jogo: " + jogosArray.get(i).getGenero());
                        System.out.println("-------------------");
                    }
                    break;
                case 4:
                    Collections.reverse(jogosArray);
                    System.out.println("--- Lista de Jogos ---");
                    for (int i = 0; i < jogosArray.size(); i++) {
                        System.out.println("Nome do jogo: " + jogosArray.get(i).getNome());
                        System.out.println("Preco do jogo: " + jogosArray.get(i).getPreco());
                        System.out.println("Genero do jogo: " + jogosArray.get(i).getGenero());
                        System.out.println("-------------------");
                    }
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Entre com uma opção válida");
                    break;
            }
        }

    }
}