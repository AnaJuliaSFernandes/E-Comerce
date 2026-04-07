import java.util.ArrayList;

class Produto {
    String nome;
    double preco;

    //construtor
    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}

class ProdutoFisico extends Produto {
    double peso;

    ProdutoFisico(String nome, double preco, double peso){
        //super chama o contrutor da classe pai
        super(nome, preco);
        this.peso = peso;
    }
}

class ProdutoDigital extends Produto {
    double tamanhoArq;

    ProdutoDigital(String nome, double preco, double tamanhoArq){
        super(nome, preco);
        this.tamanhoArq = tamanhoArq;
    }
}

class Carrinho {
    ArrayList<Produto>produtos = new ArrayList<>();

    void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    void listaProdutos(){
        System.out.println("Produtos no carrinho: \n");

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

/*class Cliente extends Produto {
    public Cliente(String nome){
        this.nome = nome;
    }
}*/

public class Main {
    public static void main(String[] args) {

        ProdutoFisico p1 = new ProdutoFisico("Notebook", 5000,2.5);
        ProdutoDigital p2 = new ProdutoDigital("Curso de Java", 600,1500);
        

        Carrinho carrinho = new Carrinho();

        /*Cliente user1 = new Cliente("Marcelo");
        System.out.println(user1.nome + " o seu pedido: ");*/

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        carrinho.listaProdutos();
        carrinho.calcularTotal();
    }
    
}