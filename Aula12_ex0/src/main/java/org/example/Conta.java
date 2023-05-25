package org.example;

public class Conta {

    private int saldo;
    private String nome;

    public Conta(int saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void sacar(float valorSaque) throws SemSaldoException {

        if (valorSaque > this.saldo) {
            throw new SemSaldoException(valorSaque);
        } else {
            System.out.println("Valor disponível " + (this.saldo - valorSaque));
        }

    }

    /*
    publ,,ic void sacar(float valorSaque){
        try {
            if (valorSaque > this.saldo) {
                throw new SemSaldoException(valorSaque);
            } else {
                System.out.println("Valor disponível " + (this.saldo - valorSaque));
            }
        }catch(SemSaldoException e){
            System.out.println(e);
        }
    }
     */
}
