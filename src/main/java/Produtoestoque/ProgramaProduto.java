package Produtoestoque;

public class ProgramaProduto {
    public static void main(String[] args) {
        // 1. Instanciar dois produtos (corrigido o 'hew' para 'new')
        Produto p1 = new Produto(101, "Teclado Mecânico", 150.00, 10);
        Produto p2 = new Produto(102, "Mouse Gamer", 80.00, 5);

        // 2. Fazer reposição de estoque
        System.out.println("--- 1. Reposição ---");
        p1.repor(5);

        // 3. Realizar uma venda válida
        System.out.println("\n--- 2. Venda Válida ---");
        p1.vender(3);

        // 4. Tentar uma venda maior que o estoque
        System.out.println("\n--- 3. Venda Acima do Estoque ---");
        p2.vender(10);

        // 5. Alterar o preço por método público
        System.out.println("\n--- 4. Alteração de Preço ---");
        p2.alterarPreco(89.90);

        // 6. Exibir o estado final dos objetos
        p1.exibirDados();
        p2.exibirDados();
    }
}