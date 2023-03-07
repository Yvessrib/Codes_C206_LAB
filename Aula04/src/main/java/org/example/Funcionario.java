package org.example;

public class Funcionario {

    //Atributos
    int idade; //Idade do funcionario
    String nome; //Nome do funcionario
    int cpf; //Cpf do funcionario
    float salario; //Salario do funcionario

    /*
    public Funcionario(int idade, String nome, int cpf, float salario) {

        System.out.println("Criou um funcionario");
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    */
    public void tirarFerias(String mes, int qtddias){
        System.out.println("O funcionario " + nome + " tirou férias no mes de " + mes + " durante " + qtddias + " dias.");
    }

    public float salarioAnual(){
        float salaAnual = salario * 12;
        return salaAnual;
    }

    public float salarioAnual(float decimoterceiro){
        float salaAnual = salario*12;
        return salaAnual + decimoterceiro;
    }

    public float salarioAnual(float decimoterceiro, float decimoquarto){
        float salaAnual = salario*12;
        return salaAnual + decimoterceiro + decimoquarto;
    }


}
