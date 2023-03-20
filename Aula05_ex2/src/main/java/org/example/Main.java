package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Estudante [] estudantes = new Estudante[200];

        Escola e1 = new Escola();
        e1.nome = "Inatel";
        e1.email = "inatel@gmail.com.br";
        e1.numTelefone = 985028967;
        e1.endereco = "Rua quito carneiro, 107, Inatel";

        boolean flag = true;

        while (flag) {

            System.out.println("Bem vindo a escola: " + e1.nome);
            System.out.println("1 - Cadastrar novo aluno");
            System.out.println("2 - Mostrar informações dos alunos");
            System.out.println("3 - Quantidade de alunos por ano");
            System.out.println("4 - Sair do menu!");

            int op;
            op = in.nextInt();

            switch (op){

                case 1:
                    System.out.println("Cadastre um nome aluno!");
                    in.nextLine();

                    System.out.print("Entre com o nome do aluno: ");
                    String nomeAluno = in.nextLine();

                    System.out.print("Entre com a idade do aluno: ");
                    int idadeAluno = in.nextInt();
                    in.nextLine();

                    System.out.print("Entre com o ano do aluno: ");
                    String anoAluno = in.nextLine();

                    Estudante e = new Estudante(nomeAluno,idadeAluno,anoAluno);
                    e1.addEstudante(e);

                    System.out.println("Aluno adicionado");
                    break;

                case 2:
                    e1.mostraInfo();
                    break;
                case 3:
                    e1.QtdEstudantesPorAno();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Entre com um número válido");
            }

        }


    }
}