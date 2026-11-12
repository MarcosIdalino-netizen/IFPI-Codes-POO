package ContaExer;

public class ContaCorrente {

    private String titular;
    private double saldo;
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        this.titular = titular;
        this.saldo = saldo;
        if (limite > 500) {
            this.limite = 500;
            System.out.println("Limite máximoo permitido é R$ 500.00");
        } else {
            this.limite = limite;
        }
    }

    public void sacar(double valor) {
        if (valor  <= saldo + limite) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Valor = " + valor + "R$");
        } else {
            System.out.println("Ops! Não é possível realizar o saque.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Valor depositdado: " + valor + "R$");
        } else {
            System.out.println("Erro! Valor de depósito inválido");
        }
    }

    public void exibirResumo() {
        System.out.println("------RESUMO DA CONTA------");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite disponível: " + this.limite);
    }

}
