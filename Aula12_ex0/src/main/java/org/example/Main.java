package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta[] contas = new Conta[10];

        Conta c1 = new Conta(100,"Crhis");
        Conta c2 = new Conta(20,"Anna");
        Conta c3 = new Conta(10,"Victor");

        contas[0] = c1;
        contas[1] = c2;
        contas[2] = c3;

        try {
            c1.sacar(120);
        }catch (SemSaldoException e){
            System.out.println(e);
        }

        /*
        try {
          contas[0] = c1;
          contas[1] = c2;
          contas[10] = c3;
        }catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Posição inexistente");
          System.out.println(e);
        }

        try {
          for (int i = 0; i < contas.length; i++) {
              System.out.println("Dono da conta " + contas[i].getNome());
              System.out.println("Saldo da conta " + contas[i].getSaldo());
          }

        }catch (NullPointerException e){
          System.out.println(e);
        }

        System.out.println("Tem tres contas");

        ---------------------------------------
        Scanner in = new Scanner(System.in);
        int n3 = 0;

        try{
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            n3 = n1/n2;
        }catch (ArithmeticException e){
            System.out.println("Nao pode dividir numero por 0");
            System.out.println(e);
        }catch (InputMismatchException e){
            System.out.println("Nao pode colocar float no tipo int");
            System.out.println(e);
        }finally{
            System.out.println(n3);
        }

        */

    }
}