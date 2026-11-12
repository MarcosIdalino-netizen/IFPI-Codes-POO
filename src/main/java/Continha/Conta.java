package Continha;

public class Conta {

    private int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta(int numConta, String tipo, String dono, double saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = false;
    }

    public void abriConta(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        if (this.tipo == "CC") {
            this.saldo = 50;
        }
        else if (this.tipo == "PP") {
            this.saldo = 150;
        } else {
            System.out.println("Tipo de conta inválida!");
        }

        this.status = true;
    }

    public void depositar(double saldo, double valor) {
        if (this.status == true) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println("Valor depositado com sucesso!");
            } else {
                System.out.println("Erro! O valor não pode ser negativo");
            }
        }
    }

    public void sacar(double saldo, double valor) {
        if (this.status == true) {
            if (valor > 0 && valor <= this.saldo) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Erro! O valor não pode ser sacado!");
            }
        }
    }

    public void pagarMensal(double valor) {
        if (this.tipo == "CC") {
            valor = 12;
        } else if (this.tipo =="PP") {
            valor = 20;
        }

        if (this.status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
                System.out.println("Mensalidade da conta paga!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar!");
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Erro! Não pode fechar conta com saldo. Saldo: " + this.saldo);
        }
        else if (this.saldo < 0) {
            System.out.println("Erro! Não pode fechar conta com debito. Saldo: " + this.saldo);
        }
        else {
            this.status = false;
            System.out.println("Conta: " + this.numConta + "Fechada com sucesso!");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void exibirResumo() {
        System.out.println("-----STATUS DA CONTA-----");
        System.out.println("Numero conta: " + this.numConta);
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo atual " + this.getSaldo());
        if (this.status) {
            System.out.println("Situação: ABERTA");
        } else {
            System.out.println("Situação: FECHADA");
        }
    }


}
