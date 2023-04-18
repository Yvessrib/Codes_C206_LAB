package org.example;

public class Engenheiro extends Funcionario implements Gerencia{

    private String ramo;

    public Engenheiro(String nome, int idade, double salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do engenheiro ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario " + getSalario());
        System.out.println("Ramo: " + ramo);
    }

    @Override
    public void executa() {
        System.out.println("Engenheiro está codando");
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void executaAcao() {

        System.out.println("O egenheiro " + getNome() + " está prototipando um circuito");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 500;
    }

    @Override
    public void gerencia() {
        System.out.println("O engenheiro está gerenciado um projeto");
    }

    @Override
    public void estuda() {
        System.out.println("O engenheiro está estudando");
    }


}

