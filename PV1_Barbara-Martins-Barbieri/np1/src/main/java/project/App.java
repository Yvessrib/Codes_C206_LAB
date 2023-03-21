package project;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean flag = true;

        Empresa empresa = new Empresa("Amazon");

        System.out.println("Bem-vindo(a) a " + empresa.nome + "! \n");

        while(flag) {

            System.out.println("--- MENU ---");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Mostrar informações da empresa e seus produtos");
            System.out.println("3. Exibir nomes dos produtos de um fabricante específico");
            System.out.println("4. Mostrar porcentagem de produtos disponíveis em estoque com avaliação igual ou superior a 3");
            System.out.println("5. Comprar produto");
            System.out.println("6. Sair do sistema");
            
            System.out.print("Opção: ");
            int opcao = input.nextInt();
            
            System.out.println();

            switch(opcao) {

                case 1:
                    
                    System.out.println("Você selecionou: ADICIONAR PRODouUTO \n");

                    System.out.print("Insira o nome do produto: ");
                    input.nextLine();
                    String nomeProduto = input.nextLine();

                    System.out.print("Insira o part number do produto: ");
                    String partNumber = input.nextLine();

                    System.out.print("Insira a quantidade do produto em estoque: ");
                    int quantidade = input.nextInt();

                    System.out.print("Insira a nota do produto (0 a 5): ");
                    double nota = input.nextDouble();

                    System.out.print("Insira o nome do fabricante: ");
                    input.nextLine();
                    String nomeFabricante = input.nextLine();

                    System.out.print("Insira o CNPJ do fabricante: ");
                    String cnpj = input.nextLine();

                    Produto produto = new Produto(nomeProduto, partNumber, quantidade, nota, nomeFabricante, cnpj);
                    empresa.adicionarProduto(produto);
                    break;

                case 2:

                    System.out.println("Você selecionou: MOSTRAR INFORMAÇÕES DA EMPRESA E SEUS PRODUTOS \n"); 
                    empresa.mostraInfo();
                    break;

                case 3:

                    System.out.println("Você selecionou: EXIBIR NOMES DOS PRODUTOS DE UM FABRICANTE ESPECÍFICO \n");

                    System.out.print("Insira o CNPJ do fabricante: ");
                    input.nextLine();
                    String cnpjFabricante = input.nextLine();

                    System.out.println();
                    empresa.mostraProdutosEspecificos(cnpjFabricante);
                    break;

                case 4:

                    System.out.println("Você selecionou: MOSTRAR PORCENTAGEM DE PRODUTOS DISPONÍVEIS EM ESTOQUE COM AVALIAÇÃO IGUAL OU SUPERIOR A 3 \n");
                    
                    double melhoresProdutos = empresa.verificaMelhoresProdutos(); 
                    System.out.println(melhoresProdutos + "% dos produtos em estoque têm avaliação igual ou superior a 3. \n");
                    break; 

                case 5:

                    System.out.println("Você selecionou: COMPRAR PRODUTO \n");

                    System.out.print("Insira o part number do produto: ");
                    input.nextLine();
                    String partNumberProduto = input.nextLine();

                    if(empresa.comprarProduto(partNumberProduto))
                        System.out.println("Produto adicionado ao carrinho! \n");
                    else 
                        System.out.println("Produto indisponível para venda. \n");
                    
                    break;

                case 6:

                    System.out.println("Você selecionou: SAIR DO SISTEMA \n");
                    System.out.println("Obrigado! Até mais.");
                    flag = false;
                    break;

                default:

                    System.out.println("Selecione um número válido! \n");
                    break;

            }

        }

        input.close();

    }

}