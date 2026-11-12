package ClienteContaBancaria;

public class ProgramaContaBancaria {
    static void main(String[] args) {
        Cliente C1 = new Cliente();
        C1.Cadastrar("Marcos", "133.547.877-77", "(86) 99275-5477");

        Cliente C2 = new Cliente();
        C2.Cadastrar("Francisco", "144.098.123-05", "(46) 99340-8912");

        ContaBancaria conta1 = new ContaBancaria(1004, C1, 0.0);
        ContaBancaria conta2 = new ContaBancaria(1007, C2, 0.0);

        System.out.println("-----> Depositos");
        conta1.depositar(1000);
        System.out.println();
        conta2.depositar(500);
        System.out.println();

        conta1.sacar(250);
        System.out.println();

        conta2.sacar(1000);
        System.out.println();

        System.out.println("----> RENDIMENTOS");
        conta1.renderConta(10);
        System.out.println();
        conta2.renderConta(5);
        System.out.println();

            conta1.exibirExtrato();
            System.out.println();
            conta2.exibirExtrato();
            System.out.println();

            C1.exibirDados();
            System.out.println();
            C2.exibirDados();
            System.out.println();

    }

}
