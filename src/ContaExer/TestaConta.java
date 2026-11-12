package ContaExer;

public class TestaConta {
    static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Marcos Idalino De Sousa Filho", 200.00, 500.00);

        c1.sacar(600.00);
        System.out.println();
        c1.sacar(200.00);
        System.out.println();
        c1.exibirResumo();
        System.out.println();
        c1.depositar(150.00);
        System.out.println();

        c1.exibirResumo();
    }
}
