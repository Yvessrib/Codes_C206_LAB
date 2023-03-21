package project;

public class Produto {

    String nome;
    String partNumber;
    int quantidade;
    double nota;
    Fabricante fabricante;

    public Produto(String nomeProduto, String partNumber, int quantidade, double nota, String nomeFabricante, String cnpj) {

        this.nome = nomeProduto;
        this.partNumber = partNumber;
        this.quantidade = quantidade;
        this.nota = nota;
        this.fabricante = new Fabricante(nomeFabricante, cnpj);

    }

    void mostraInfo() {

        System.out.println("-- INFORMAÇÕES DO PRODUTO --");
        System.out.println("Nome: " + this.nome);
        System.out.println("Part number: " + this.partNumber);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Nota: " + this.nota);
        this.fabricante.mostraInfo();

    }
    
}