package org.example;

public abstract class Funcionario {

    private String nome; //Nome do funcionario
    private int idade; //Idade do funcionario
    private double salario; //Salario do funcionario

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public abstract void mostraInfo();

    public abstract void executa();


    /*
    public void mostraInfo(){

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
    }
   */



    public void executaAcao(){

    }

    public double salarioBonus(){
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
