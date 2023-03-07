package org.example;
public class Main {
    public static void main(String[] args) {

        //Instanciando os funcionarios
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        //Funcionario f1 = new Funcionario(21, "Victor",126522, 500);

        //Atributos do funcionario f1
        f1.salario = 500;
        f1.cpf = 11111111;
        f1.nome = "Victor";
        f1.idade = 21;

        //Atributos do funcionario f2
        f2.salario = 600;
        f2.cpf = 232323;
        f2.nome = "Yves";
        f2.idade = 20;

        f1 = f2; //Igualando os dois ponteiros

        if(f1 == f2){ //Verificando se os ponteiros/instâncias são iguais
            System.out.println("Sao os mesmos objetos");
        }
        else
            System.out.println("Sao objetos diferentes");

        //Calculando salario anual atraves do método salarioAnual
        System.out.println("O salario anual do Victor é: ");
        System.out.println(f1.salarioAnual(300));

        //Usando o método de tirarFerias
        f1.tirarFerias("Junho", 27);


    }
}