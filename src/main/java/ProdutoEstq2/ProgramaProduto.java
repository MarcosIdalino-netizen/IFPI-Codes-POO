package ProdutoEstq2;

public class ProgramaProduto {
    static void main(String[] args) {
        Produto p1 = new Produto( 0, "", 0.0, 0);
        Produto p2 = new Produto(0,  "", 0.0, 0);

        p1.cadastrar(1314, "Marcos", 4.50);
        p2.cadastrar(2022, "Luana",  6.50);

        p1.repor(10);
        p2.repor(20);

        p1.vender(5, 0);
        System.out.println();
        p2.vender(5, 0);
        System.out.println();

        p1.vender(40, 0);
        System.out.println();
        p2.alterarPreco(-10);
        System.out.println();

        p1.exibirDados();
        System.out.println();
        p2.exibirDados();
    }
}
