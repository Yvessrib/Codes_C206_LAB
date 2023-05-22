package org.example;

public class SemSaldoException extends Exception{

    public SemSaldoException(float valor){
        System.out.println("Sem valor disponível, saque de " + valor + " negado");
    }
}
