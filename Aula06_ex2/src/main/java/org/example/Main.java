package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Victor", 1000);
        Funcionario f2 = new Funcionario("Yves", 800);
        Funcionario f3 = new Funcionario("Alice", 2000);

        //System.out.println("Temos " + Funcionario.cont + " funcionários na empresa!");
        System.out.println("Temos " + Funcionario.getCont() + " funcionários na empresa!");

        f1.mostraInfos();
        f2.mostraInfos();
        f3.mostraInfos();

        System.out.println("O Victor ganha " + f1.getSalario());
        System.out.println("O Yves ganha " + f2.getSalario());
        System.out.println("A Alice ganha " + f3.getSalario());

        f1.setSalario(1200);

        System.out.println("O Victor ganha " + f1.getSalario());
        System.out.println("O Yves ganha " + f2.getSalario());
        System.out.println("A Alice ganha " + f3.getSalario());

        //Funcionario.cont = 100;

        //System.out.println("Temos " + Funcionario.cont + " funcionários na empresa!");
        System.out.println("Temos " + Funcionario.getCont() + " funcionários na empresa!");

        Funcionario.setCont(4);
        System.out.println("Temos " + Funcionario.getCont() + " funcionários na empresa!");
    }
}