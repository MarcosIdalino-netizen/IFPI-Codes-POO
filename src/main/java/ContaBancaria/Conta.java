package ContaBancaria;

public class Conta {
    private int numeroConta;
    private String titular;
    private double saldo;



    public Conta(int numeroConta, String titulr, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titulr;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Valor depositado com sucesso!");
        } else {
            System.out.println("Valor inexistente!");
        }
    }

    boolean sacar(double valor) {
        if ( valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Valor sacado com sucesso!");
            return true;
        } else {
            System.out.println("Não é possível sacar! Valor de saque maior que saldo atual.");
            return false;
        }
    }

    void exibirSaldo() {
        System.out.println("=======CONTA======");
        System.out.println("Número da conta igual a " + this.numeroConta);
        System.out.println("Titular: "+ this.titular);
        System.out.println("Saldo atual da conta = " + this.saldo + "R$");
    }
}