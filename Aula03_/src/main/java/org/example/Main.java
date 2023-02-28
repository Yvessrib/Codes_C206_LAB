package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Aula 2 Variáveis Primitivas
        //Comentário
        /*
         Comentário de mais de uma linha

        double saldoDaConta;
        double saldo_Da_Poupanca;

        declarando constantes
        int NUMERO_ALUNOS = 18;

        String nome = 'Victor';

        //Casting
        double numDouble = 1.54;
        float numFloat;

        numFloat = float(numDouble)
        System.out.println(numFloat);


        //Entrada de daos
        //Entrada de dados com double e float deve ser com virgula, não ponto.

        Scanner entrada = new Scanner(System.in);//Criando classe Scanner

        System.out.println("Entre com um numero double"); //Entrando com double
        double numDouble = entrada.nextDouble();

        System.out.println("Entre com um numero float"); //Entrando com float
        float numFloat = entrada.nextFloat();

        System.out.println("Entre com um numero int"); //Entrando com int
        int numInt = entrada.nextInt();

        entrada.nextLine(); //para entrar com a string após fazer entrada de números

        System.out.println("Entre com seu nome"); //Entrando com nome
        String seunome = entrada.nextLine();


        //Controle de fluxo

        int num1 = 20;
        int num2 = 20;

        if(num1 == num2){
            System.out.println("Os dois números são iguais");
        }
        else{
            System.out.println("Não são iguais");
        }


         */

        Scanner entrada = new Scanner(System.in);
        System.out.print("Entre com o seu peso: ");
        double numPeso = entrada.nextDouble();
        System.out.print("Entre com a sua altura: ");
        double numAltura = entrada.nextDouble();

        double imc = (numPeso/(numAltura*numAltura));

        System.out.println(imc);
        if(imc < 18.5){
            System.out.println("O indivíduo está abaixo do peso");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("O indivíduo está com peso normal");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println("O indivíduo está em Sobrepeso");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.println("O indivíduo está com Obesidade de grau I");
        }
        else if(imc >= 35 && imc <= 39.9){
            System.out.println("O indivíduo está com Obesidade de grau II");
        }
        else{
            System.out.println("O indivíduo está com Obesidade de grau III ou mórbida");
        }


    }
}