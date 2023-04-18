package org.example;

public class Arquiteto extends Funcionario{

    private String especialidade;

    public Arquiteto(String nome, int idade, double salario, String especialidade) {
        super(nome, idade, salario);
        this.especialidade = especialidade;
    }


    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do arquiteto ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario " + getSalario());
        System.out.println("Especialidade: " + especialidade);
    }

    @Override
    public void executa() {
        System.out.println("O arquieto esta planejando um predio");
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O arquiteto " + getNome() + " planejando um predio");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 700;
    }
}
