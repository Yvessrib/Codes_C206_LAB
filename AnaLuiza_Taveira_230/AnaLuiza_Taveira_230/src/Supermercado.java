public class Supermercado {

    //Atributos
    String nome;
    String cnpj;
    String endereco;
    String numTelefone;

    //Agregação
    Produto[] produtos = new Produto[30];


    //Construtor
    public Supermercado(String nome, String cnpj, String endereco, String numTelefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
    }

    //Métodos
    //Adicionar produtos no supermercado
    public void addProduto(Produto produto) {
        for (int i = 0; i < this.produtos.length; i++) {
            // Comparando as posições para verificar se nao existe nenhuma arvore
            if (produtos[i] == null) {
                produtos[i] = produto;
                break;
            }
        }

    }

    public void mostrarMaisCaroBarato() {

        Produto [] maisCaro = new Produto[10];
        Produto [] maisBarato = new Produto[10];
        int caro = 0;
        int barato=100000;

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {

                if (produtos[i].valor > caro) {
                    maisCaro[0] = produtos[i];
                    System.out.println();
                    System.out.println("INFORMAÇÕES DO PRODUTO MAIS CARO");
                    maisCaro[0].mostrarInfos();
                }

                else if(produtos[i].valor < barato){
                    maisBarato[0] = produtos[i];
                    System.out.println();
                    System.out.println("INFORMAÇÕES DO PRODUTO MAIS BARATO");
                    maisBarato[0].mostrarInfos();
                }

            }

        }

    }

    public void contarCategorias() {
        int qtdHigiene = 0;
        int qtdUtensilios = 0;
        int qtdAlimenticios = 0;

        for (int i = 0; i < produtos.length; i++) {

            // Comparando as posições para verificar se existe um estudante
            if (produtos[i] != null) {
                if (produtos[i].categoria.equals("Higiene")) {
                    qtdHigiene+=produtos[i].quantidade;
                }

                if (produtos[i].categoria.equals("Alimenticios")) {
                    qtdAlimenticios+=produtos[i].quantidade;
                }
                if (produtos[i].categoria.equals("Utensilios")) {
                    qtdUtensilios+=produtos[i].quantidade;
                }

            }

        }

        System.out.println("Quantitdades de produtos por categoria ");
        System.out.println("Quantidade de produtos de higiene: " + qtdHigiene);
        System.out.println("Quantidade de produtos alimenticios: " + qtdAlimenticios);
        System.out.println("Quantidade de utensilios : " + qtdUtensilios);

    }


    public void mostraInfo() {
        System.out.println();
        System.out.println("--- INFORMAÇÕES DO SUPERMERCADO ---");
        System.out.println("Nome do supermercado: " + this.nome);
        System.out.println("Cnpj do supermercado: " + this.cnpj);
        System.out.println("Endereço do supermercado:  " + this.endereco);
        System.out.println("Número de telefone: " + this.numTelefone);

        for (int i = 0; i < produtos.length; i++) {

            // Comparando as posições para verificar se existe um produto
            if (produtos[i] != null) {
                produtos[i].mostrarInfos(); //mostrando as informacoes dos produtos

            }
        }
    }
}