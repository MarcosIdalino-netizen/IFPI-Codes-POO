package Oficina;

public class OrdemServico {

    private Cliente cliente;
    private String descricao;
    private double valorBase;
    private int qtd_horas;
    private boolean concluido; // Atributo de conctrole de serviço;

    public OrdemServico(Cliente cliente, int qtd_horas, String descricao, double valorBase) {
        this.cliente = cliente;
        this.descricao = descricao;

        if (valorBase < 40 || valorBase > 200) {
            System.out.println("Erro! Valor base deve ser entre 40 e 200. Valor definido para 80.00 R$");
            this.valorBase = 80.00;
        } else {
            this.valorBase = valorBase;
        }

        if (qtd_horas <= 0) {
            System.out.println("Valor inválido! Não pode ser igual ou menor a zero. Valor definido para 1 hora.");
            this.qtd_horas = 1;
        } else {
            this.qtd_horas = qtd_horas;
        }

        this.concluido = false;
    }

    public void fechamentoServico() {
        if (this.concluido) {
            System.out.println("Erro! Essa ordem de serviço já foi encerrada anteriomente!");
        } else {
            this.concluido = true;
            System.out.println("Serviço encerrado com sucesso!");
        }
    }

    public double calcularValorTotal() {
        double valorBruto = this.valorBase * this.qtd_horas;
        if (this.qtd_horas > 5) {
             double des = valorBruto * 0.1;
            return valorBruto - des;
        } else {
            return valorBruto;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtd_horas() {
        return qtd_horas;
    }

    public boolean isControle() {
        return concluido;
    }

    public void exibirFatura() {
        System.out.println("---DETALHES---");
        this.cliente.exibirCliente();
        System.out.println("Descriçao: " + this.getDescricao());
        System.out.println("Quantidade de horas trabalhada: " + this.getQtd_horas());
        if (this.concluido) {
            System.out.println("Status: Serviço CONCLUÍDO!");
        } else {
            System.out.println("Status: Serviço em ANDAMENTO!");
        }
        System.out.println("Valor final a ser pago: " + this.calcularValorTotal());
    }
}
