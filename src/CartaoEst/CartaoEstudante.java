package CartaoEst;

public class CartaoEstudante {

    private String nomeAluno;
    private double saldo;
    private double valorPassagem;

    public CartaoEstudante(String nomeAluno, double saldo, double valorPassagem) {
        this.nomeAluno = nomeAluno;
        this.saldo = saldo;
        if (valorPassagem < 1.50 || valorPassagem > 5.00) {
            System.out.println("Valor inválido! Valor definido para 2.50 R$");
            this.valorPassagem = 2.50;
        } else {
            this.valorPassagem = valorPassagem;
        }
    }

    public boolean passarNaCatraca() {
        if (this.valorPassagem <= this.saldo) {
            this.saldo -= valorPassagem;
            System.out.println("Viagem Autorizada comm sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public void recarregar(double valor) {
        if (valor > 0) {
          this.saldo += valor;
            System.out.println("Recarga feita com sucesso!");
        } else {
            System.out.println("Valor Inválido!");
        }
    }

    public void exibirResultados() {
        System.out.println("----DETALHES-----");
        System.out.println("Nome Aluno: " + this.nomeAluno);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Valor passagem: " + this.valorPassagem);
    }
}
