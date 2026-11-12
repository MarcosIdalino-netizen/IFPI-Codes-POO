package Lojaeletronicos;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int qtd_estoque;

    public Produto() {}

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void cadastrar(int codigo, String nome, double preco, int qtd_estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.qtd_estoque = qtd_estoque;
    }
    public void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            this.qtd_estoque += qtd;
            System.out.println("Estoque atualizado com sucesso!");
        }
    }

    public void darDescontoo(double percentual) {
        if (percentual > 0 && percentual <= 0.5) {
            this.preco = this.preco - (this.preco * percentual);
            System.out.println("Desconto aplicado com sucesso! valor do desconto " + percentual);
            System.out.println("Novo preço = " + this.preco);
        } else {
            System.out.println("Erro! Não é possível aplicar desconto pra essa compra!");
        }
    }

    public void diminuirEstoque(int qtd) {
        this.qtd_estoque -= qtd;
    }

    public void exibirFicha() {
        System.out.println("-----FICHA-----");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("QuantidadeEstoque: " + this.qtd_estoque);
    }

}
