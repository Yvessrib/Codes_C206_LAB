public class Produto {

    //Atributos do produto
    int codigoSerie;
    String nome;
    String categoria;
    int quantidade;
    double valor;


    //Método
    public void mostrarInfos(){
        System.out.println();
        System.out.println("---INFORMAÇÕES DOS PRODUTOS--");
        System.out.println("Código série: "+this.codigoSerie);
        System.out.println("Nome: "+this.nome);
        System.out.println("Categoria: "+this.categoria);
        System.out.println("Quantidade: "+this.quantidade);
        System.out.println("Valor: "+this.valor);


    }

}
