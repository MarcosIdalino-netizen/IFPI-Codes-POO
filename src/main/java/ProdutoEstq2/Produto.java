package ProdutoEstq2;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private double total;

    public Produto(int codigo, String nome, double preco, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.total = total;
    }

    public void cadastrar(int codigo, String nome, double precoInical) {
        this.codigo = codigo;
        this.nome = nome;
        if (precoInical > 0) {
            this.preco = precoInical;
            System.out.println("Preço atualizado com sucesso!");
        } else {
            System.out.println("Erro! O preço não pode ser negativo");
        }
    }
    public void repor(int quantidade){
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println("Estoque atualizado com sucesso!");
        } else {
            System.out.println("Não é possivel atualizar o estoque: Valor negativo!");
        }
    }

    public boolean vender(int quantidade, double total) {
        if (quantidade > 0 && quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            total = quantidade * this.preco;
            System.out.println("Venda realizada com sucesso! Quantidade vendida = " + quantidade);
            System.out.println("Total da venda em R$" + total);
            return true;
        } else {
            System.out.println("ERRO! Quantidade maior que a do estoque. ");
            return false;
        }
    }

    public void alterarPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
            System.out.println("Preço atuaizado com sucesso! novo preço " + this.preco);
        } else {
            System.out.println("Preço inválido! Precisa ser maior que zero.");
        }
    }

    public void exibirDados() {

        System.out.println("-------DADOS-------");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco + "R$");
        System.out.println("Quantidade em estoque: " + this.quantidadeEstoque);

    }
}