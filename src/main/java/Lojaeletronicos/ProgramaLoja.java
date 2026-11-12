package Lojaeletronicos;

public class ProgramaLoja {
    static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.cadastrar(492, "Headset Gamer", 50.0, 10);
        p2.cadastrar(994, "Mouse Gamer", 34, 5);

        venda v1 = new venda();
        venda v2 = new venda();

        v1.iniciarVenda(1, p1);
        v2.iniciarVenda(2, p2);

        System.out.println("---VENDA 1---");
        v1.realizarVenda(5);
        v1.exibirComprovante();
        System.out.println();

        System.out.println("---VENDA 2---");
        v2.realizarVenda(10);
        v2.exibirComprovante();
        System.out.println();

        System.out.println("---Adicionando estoque e repetindo----");
        p2.adicionarEstoque(10);
        v2.realizarVenda(10);
        v2.exibirComprovante();
        System.out.println();

        System.out.println("---Aplicando Desconto---");
        p1.darDescontoo(10);

        System.out.println("----Fichas finais dos produtos----");
        p1.exibirFicha();
        System.out.println();
        p2.exibirFicha();
    }

}
