package ContaBancaria;

public class ContaBancaria {
    static void main(String[] args) {
         Conta c1 = new Conta(001, "Marcos", 500);

        System.out.println("==DEPOSITO==");
         c1.depositar(200);

        System.out.println("==SAQUE DE 100 R$==");
         c1.sacar(100);

        System.out.println("==SAQUE DE 1000 R$==");
         c1.sacar(1000);

        System.out.println("------------------");
         c1.exibirSaldo();

    }
}
