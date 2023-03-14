package org.example;

public class Escola {

    String nome;
    String email;
    int numTelefone;
    String endereco;
    Estudante[] estudantes = new Estudante[300];



    public void addEstudante (Estudante estudante){
        for(int i = 0; i < estudantes.length; i++){
            if(estudantes[i] == null){
                estudantes[i] = estudante;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Lista de alunos da escola " + nome);
        for ( int i = 0; i < estudantes.length; i++){
            if(estudantes[i] != null){
                estudantes[i].mostraInfo();
            }
        }
    }

    public void QtdEstudantesPorAno(){

        int seg = 0;
        int terc = 0;

        for ( int i = 0; i < estudantes.length; i++){
            if(estudantes[i] != null){
                if(estudantes[i].ano.equals("Segundo")){
                    seg++;

                } else if (estudantes[i].ano.equals("Terceiro")) {
                    terc++;
                }
            }
        }

        System.out.println("Tem " + seg + " alunos no segundo ano");
        System.out.println("Tem " + terc + " alunos no terceiro ano");
    }

}
