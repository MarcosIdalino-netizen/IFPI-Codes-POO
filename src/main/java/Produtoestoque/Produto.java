package Produtoestoque;

public class Produto {
    // Atributos privados
    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor com os 4 parâmetros
    public Produto(int codigo, String nome, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método para repor estoque
    public void repor(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println("Reposição efetuada com sucesso!");
        } else {
            System.out.println("Quantidade para reposição deve ser maior que zero.");
        }
    }

    // Método para vender
    public boolean vender(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada com sucesso!");
            return true;
        } else {
            System.out.println("Venda não realizada: estoque insuficiente ou quantidade inválida.");
            return false;
        }
    }

    // Método para alterar preço
    public void alterarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
            System.out.println("Preço alterado com sucesso!");
        } else {
            System.out.println("Preço não pode ser negativo!");
        }
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("\n--- DADOS DO PRODUTO ---");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Estoque: " + this.quantidadeEstoque + " unidades");
    }
}