package org.example;

import Exercicio1.Arquivo;
import Exercicio1.Funcionarios;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo a1 = new Arquivo();
        Funcionarios f1 = new Funcionarios();
        Scanner in = new Scanner(System.in);
        Boolean flag = true;

        while(flag){
            System.out.println("--- Bem vindo ao menu ---");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Sair do menu");

            int op = in.nextInt();
            switch (op){
                case 1:
                    in.nextLine();
                    System.out.println("Cadastrando funcionário");

                    System.out.print("Entre com o nome: ");
                    f1.setNomeFunc(in.nextLine());

                    System.out.print("Entre com o CPF: ");
                    f1.setCpfFunc(in.nextLine());

                    System.out.print("Entre com a idade: ");
                    f1.setIdadeFunc(in.nextInt());

                    a1.escrever(f1);
                    break;

                case 2:
                    ArrayList <Funcionarios> funcs = a1.ler();
                    Collections.sort(funcs);

                    for (int i = 0; i < funcs.size(); i++){
                        System.out.println("--- Infos dos Funcionarios ---");
                        System.out.println("Nome: " + funcs.get(i).getNomeFunc());
                        System.out.println("CPF: " + funcs.get(i).getCpfFunc());
                        System.out.println("Idade: " + funcs.get(i).getIdadeFunc());
                        System.out.println("------------------------------");
                    }
                    break;

                case 3:
                    System.out.println("--- Saindo do sistema ---");
                    flag = false;
                    break;

                default:
                    System.out.println("--- Insira uma opção válida ---");
            }

        }

    }
}