package org.example;

public class Professor extends Funcionario{

    private String materia;

    public Professor(String nome, int idade, double salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do professor ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario " + getSalario());
        System.out.println("Materia: " + materia);
    }

    @Override
    public void executa() {
        System.out.println("O professor está dando aula");
    }

    public void corrigirProvas(){
        System.out.println("O professor " + getNome() + " esta corrigindo prova");
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void executaAcao() {
        super.executaAcao();
        System.out.println("O professor " + getNome() + " está dando aula");
    }

    @Override
    public double salarioBonus() {
        return super.salarioBonus() + 600;
    }


}
