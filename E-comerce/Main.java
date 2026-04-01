import java.util.ArrayList;

class Produto {
    String nome;
    double preco;
}

class ProdutoFisico extends Produto {
    double peso;
}

class ProdutoDigital extends Produto {
    double tamanhoArq;
}

class Carrinho {
    ArrayList<Produto>produtos = new ArrayList<>();

    void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    void listaProdutos(){
        System.out.println("Produtos no carrinho: ");

        for(Produto p: produtos){
            System.out.println(p.nome + "- R$ " +p.preco);

            //verificando o tipo do produto
            if (p instanceof ProdutoFisico) {
                ProdutoFisico pf = (ProdutoFisico) p;
                System.out.println("Peso: " + pf.peso + " kg");
            }

            if (p instanceof ProdutoDigital) {
                ProdutoDigital pd = (ProdutoDigital) p;
                System.out.println("Tamanho do arquivo: " + pd.tamanhoArq + " MB \n");
            }
        }
    }

    void calcularTotal(){
        double total = 0;

        for(Produto p : produtos){
            total += p.preco;
        }

        System.out.println("Total de compra R$ " + total);
    }

}

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 3500;

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 150;

        ProdutoFisico fisico1 = new ProdutoFisico();
        fisico1.nome = "Fone";
        fisico1.preco = 50.00;
        fisico1.peso = 300;

        ProdutoDigital digital1 = new ProdutoDigital();
        digital1.nome = "Fotografia";
        digital1.preco = 10.90;
        digital1.tamanhoArq = 25;

        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);
        carrinho.adicionarProduto(fisico1);
        carrinho.adicionarProduto(digital1);

        carrinho.listaProdutos();
        carrinho.calcularTotal();
    }
    
}