package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc =  new Scanner (System.in); //Configurando entrada de dados
        Boolean flag = true; //Flag para o menu
        Arquivo arquivo = new Arquivo(); //Criando o arquivo
        ArrayList<Jogo> jogosArray = new ArrayList<>(); //Array de jogos para ordenação

        while(flag){
            //Configurando as opções do menu
            System.out.println("--- MENU ---");
            System.out.println("1 - Adicionar Jogo no Arquivo");
            System.out.println("2 - Mostrar informações do Arquivo");
            System.out.println("3 - Ordenar jogos em ordem crescente de preço");
            System.out.println("4 - Ordenar jogos em ordem decrescente de preço");
            System.out.println("5 - Sair do Menu");

            //Operador do Menu
            int op = sc.nextInt();
            switch (op) {

                case 1: //Adicionando um novo jogo no arquivo
                    System.out.println("--- Adicionando Jogo ---");
                    //Entrando com o nome do jogo
                    System.out.print("Entre com o nome do Jogo: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    try {

                        //Entrando com o preço do jogo
                        System.out.print("Entre com o preço do Jogo: ");
                        double preco;
                        preco = sc.nextDouble();

                        //Verifiando se o preço é valido
                        if (preco > 0) {
                        //Se for válido, não faz nada
                        }else {
                            throw new PrecoNegativoException("Preço inválido!");
                            //Inválido, ativa a exception que para a execução dessa parte, voltando para o menu
                        }

                        //Entrando com o gênero do jogo
                        System.out.print("Entre com o gênero do Jogo: ");
                        sc.nextLine();
                        String genero = sc.nextLine();

                        //Criando o jogo, escrevendo no arquivo e adicionando ao Array
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
                    //Lendo o arquivo e adicionando no array de leitura
                    ArrayList<Jogo> jogos = arquivo.ler();
                    //Mostrando os dados do arquivo
                    System.out.println("--- Lista de Jogos ---");
                    for (int i = 0; i < jogos.size(); i++) {
                        System.out.println("Nome do jogo: " + jogos.get(i).getNome());
                        System.out.println("Preco do jogo: " + jogos.get(i).getPreco());
                        System.out.println("Genero do jogo: " + jogos.get(i).getGenero());
                        System.out.println("-------------------");
                    }
                    break;
                case 3:
                    //Usando o arquivo de criação dos jogos para mostrar ordenado de maneira crescente de preço
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
                    //Usando o arquivo de criação dos jogos para mostrar ordenado de maneira decrescente de preço
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
                    //Opção de sair do menu, finalizando o código
                    flag = false;
                    break;
                default:
                    //Default padrão
                    System.out.println("Entre com uma opção válida");
                    break;
            }
        }

    }
}