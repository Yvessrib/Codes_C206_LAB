package org.example;

public class Aldeia {

    //Criando aldeia e array de ninjas
    String nome;
    int qtdMoradores;
    String regiao;
    Ninja[] ninjas = new Ninja[100];

    //Construtor para facilitar criação da aldeia
    public Aldeia(String nome, int qtdMoradores, String regiao) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
    }

    //Metodo para adicionar mais ninjas
    public void adicionarNinja(Ninja ninja){

        for(int i = 0; i < ninjas.length; i++){
            if(ninjas[i] == null){
                ninjas[i] = ninja;
                System.out.println("Ninja adicionado com sucesso!");
                System.out.println();
                break;
            }
        }
    }

    //Metodo para mostrar infos da aldeia e de ninjas
     public void mostraInfo(){
         System.out.println("--- Infos da Aldeira ---");
         System.out.println("Nome da aldeia: " + nome);
         System.out.println("Quantidade de moradores: " + qtdMoradores);
         System.out.println("Regiao: " + regiao);

         for(int i = 0; i < ninjas.length; i++){
             if(ninjas[i] != null) {
                 ninjas[i].mostraInfo(); //Usando o metodo da classe Ninja
             }
         }
         System.out.println();
     }

     //Metodo para mostrar nomes de ninjas cujo ranking é S
     public void rankingS(){

         System.out.println("Ninjas classificados como Ranking S: ");
         for(int i = 0; i < ninjas.length; i++){
             if(ninjas[i] != null) {
                 if(ninjas[i].ranking.equals("S")){
                     System.out.println("Nome: " + ninjas[i].nome);
                 }
             }
         }
         System.out.println();
     }

     //Metodo para mostrar quantidade de ninjas por título
     public void qtdTitulos(){

        int Gennin = 0;
        int Chunnin = 0;
        int ANBU = 0;

         System.out.println("Quantidade de ninjas por título:");
         for(int i = 0; i < ninjas.length; i++){
             if(ninjas[i] != null) {

                 if(ninjas[i].titulo.equals("Gennin")){
                     Gennin++;
                 }

                 if(ninjas[i].titulo.equals("Chunnin")){
                     Chunnin++;
                 }

                 if(ninjas[i].titulo.equals("ANBU")){
                     ANBU++;
                 }
             }
         }

         System.out.println("Quantidade de ninjas Gennin: " + Gennin);
         System.out.println("Quantidade de ninjas Chunnin: " + Chunnin);
         System.out.println("Quantidade de ninjas ANBU " + ANBU);
         System.out.println();
     }
}
