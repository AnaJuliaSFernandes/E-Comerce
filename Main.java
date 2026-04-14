import java.util.Scanner;
import java.util.ArrayList;

class Cliente {
    private String nome;

    //construtor / get e set encapisulamento
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    //this : referenciacia a veriavel declarada lá em cima 
    public void aplicarDesconto(double percentual) {
        this.preco = this.preco - (this.preco * percentual / 100);
    }
}

class Carrinho {
    private ArrayList<Produto>produtos;

    //objeto
    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        if (produto.getPreco() > 0) {
             produtos.add(produto);
        }else {
            System.out.println("Produto invalido não adicionado!");
        }
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p: produtos) {
            total += p.getPreco();
        }
        return total;
    }

    public void mostrarProdutos(){
        
        //verifica se está vazio
        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio");
        }
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - R$" + p.getPreco());
        }
    }

    public ArrayList<Produto>getProdutos() {
        return produtos;
    }
}

class Pedido {
    private Cliente cliente;
    private Carrinho carrinho;

    public Pedido(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //cliente
        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        Cliente cliente = new Cliente(nomeCliente);
        //Produtos
        Produto p1 = new Produto("Notebook", 3000);
        Produto p2 = new Produto("Mouse", 100);
        Produto p3 = new Produto("Teclado", 200);
        //Aplicando desconto
        p1.aplicarDesconto(10);
        //carrinho
        Carrinho carrinho = new Carrinho();
        //Menu produtos
        boolean continuarComprando = true;
        while (continuarComprando) {
            System.out.println("\n===========Menu Produtos==========");
            System.out.println("\n===========Menu Produtos==========");
            System.out.println("\n===========Menu Produtos==========");
            System.out.println("\n===========Menu Produtos==========");
            System.out.println("\n===========Menu Produtos==========");
            System.out.println("\n===========Menu Produtos==========");
            System.out.println("\n===========Menu Produtos==========");
            System.out.println("\n===========Menu Produtos==========");
        }
    }
    
}
