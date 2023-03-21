package project;

public class Empresa {

    String nome;
    Produto[] produtos = new Produto[20];

    public Empresa(String nome) {

            this.nome = nome;

    }

    void mostraInfo() {

        System.out.println("-- INFORMAÇÕES DA EMPRESA --");
        System.out.println("Nome: " + this.nome);
        System.out.println();

        for(Produto produto : produtos) {

            if(produto != null) {

                produto.mostraInfo();
            
            }
        
        }

    }

    void adicionarProduto(Produto produto) {

        boolean adicionado = false;

        for(int i = 0; i < produtos.length; i++) {

            if(produtos[i] == null) {

                produtos[i] = produto;
                adicionado = true;
                break;

            }

        }

        if(adicionado)
            System.out.println("Produto adicionado com sucesso! \n");
        else
            System.out.println("Não foi possível adicionar o produto. \n");

    }

    double verificaMelhoresProdutos() {

        int produtosCadastrados = 0;
        int melhoresProdutos = 0;

        double porcentagem;

        for(Produto produto : produtos) {

            if(produto != null) {

                if(produto.nota >= 3 && produto.quantidade > 0) {

                    melhoresProdutos++;

                }

                produtosCadastrados++;

            }

        }

        
        porcentagem = (double)melhoresProdutos/produtosCadastrados;
        porcentagem = porcentagem * 100;

        return porcentagem;

    }

    void mostraProdutosEspecificos(String cnpjFabricante) {

        System.out.println("-- PRODUTOS DO FABRICANTE " + cnpjFabricante + " --");

        boolean semProduto = true;

        for(Produto produto : produtos) {

            if(produto != null) {

                if(produto.fabricante.cnpj.equals(cnpjFabricante)) {

                    System.out.println("- " + produto.nome);
                    semProduto = false;

                }

            }

        }

        if(semProduto)
            System.out.println("Fabricante sem produtos cadastrados no sistema.");

        System.out.println();

    }

    boolean comprarProduto(String partNumber) {

        for(Produto produto : produtos) {

            if(produto != null) {

                if(produto.partNumber.equals(partNumber) && produto.quantidade > 0) {
                    
                    produto.quantidade--;
                    return true;

                }

            }

        }
        
        return false;

    }
    
}