package ClienteContaBancaria;

public class ContaBancaria {

    private int numero;
    private Cliente titular;
    private double saldo;

    public ContaBancaria(int numero, Cliente titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void abrirConta(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! valor do saque: " + valor);
            return true;
        } else {
            System.out.println("Erro! Não é possível realizar o saque");
            return false;
        }
    }

    public void renderConta(double perentual) {
        if (perentual > 0) {
            this.saldo += this.saldo * (perentual/100.0);
            System.out.println("Saldo atualizado! Saldo atual com percetual de " + perentual + "%  =" + this.saldo + "R$" );
        } else {
            System.out.println("Sem rendimento! saldo atual: " + this.saldo + "R$");
        }
    }

    public void exibirExtrato() {
        System.out.println("----- EXTRATO -----");
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Titular: " + this.titular.getNome());
    }
}
