import java.util.Scanner;
public class Main {

    //Esse algoritmo foi baseado no exercicio de "Escola" feito durante a aula no dia 22/08/2022
    // O algortimo feito em sala está disponivel em https://github.com/analuizataveira/C206/tree/main/Laboratório/ExerciciosSala/Array2


    public static void main(String[] args) {

        //Entrada de dados
        Scanner sc = new Scanner(System.in);

        Supermercado supermercado = new Supermercado("Supermercados AnaLandia", "200.200.87/0001", "Rua Antonio Amercio Junqueira,327","3471-4655");


        //flag para controle do while
        boolean flag = true;


        while(flag=true) {
            System.out.println("BEM VINDO AO " + supermercado.nome);
            System.out.println("SELECIONE A OPÇÃO DESEJADA");
            System.out.println("1-ADICIONAR UM PRODUTO NO SUPERMERCADO");
            System.out.println("2- MOSTRAR A QUANTIDADE DE PRODUTOS EM CADA CATEGORIA");
            System.out.println("3-MOSTRAR AS INFORMAÇÕES SOBRE OS PRODUTOS E SUPERMERCADO");
            System.out.println("4- MOSTRAR INFORMAÇÕES DO PRODUTO MAIS CARO E DO MAIS BARATO DO SUPERMERCADO");
            System.out.println("5- SAIR DO MENU");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Produto produto = new Produto();
                    sc.nextLine();
                    System.out.println("Codigo série do produto ");
                    produto.codigoSerie = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nome do produto ");
                    produto.nome = sc.nextLine();
                    System.out.println("Opções de categoria: Higiene, Utensilios e Alimenticios");
                    System.out.println("Categoria do produto ");
                    produto.categoria = sc.nextLine();
                    System.out.println("Quantidade de produto ");
                    produto.quantidade = sc.nextInt();
                    System.out.println("Valor do produto ");
                    produto.valor = sc.nextDouble();
                    supermercado.addProduto(produto);
                    break;


                case 2:
                    supermercado.contarCategorias();
                    break;


                case 3:
                    supermercado.mostraInfo();
                    break;

                case 4:
                    supermercado.mostrarMaisCaroBarato();

                case 5:
                    flag = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }

        sc.close();


        }

    }



