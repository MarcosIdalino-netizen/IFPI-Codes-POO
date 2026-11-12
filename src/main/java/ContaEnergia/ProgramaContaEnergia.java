package ContaEnergia;

public class ProgramaContaEnergia {
    static void main(String[] args) {
        ConataEnergia a1 = new ConataEnergia("Marcos", 002, 0.0, 0.75);
        ConataEnergia a2 = new ConataEnergia("Junior", 003, 0.0, 0.75);

        a1.registrarConsumo(200);
        a2.registrarConsumo(110);

        a1.exibirConta();
        System.out.println();
        a2.exibirConta();
        System.out.println();
        a1.registrarConsumo(-10);
    }
}
