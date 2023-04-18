package org.example;

public class Funcionario {

    String nome;
    int id;
    private int salario;
    private static int cont = 0;
    //public static int cont = 0;

    public Funcionario(String nome, int salario) {
        cont++;
        this.nome = nome;
        this.id = cont;
        this.salario = salario;
    }

    public void mostraInfos(){
        System.out.println("--- Infos do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Id: " + id);
    }

    public static int getCont(){
        return cont;
    }

    public static void setCont (int cont){
        Funcionario.cont = cont;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
