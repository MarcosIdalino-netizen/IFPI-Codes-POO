package LocacaoVeiculo;

public class Locacao {

    private Cliente cliente;
    private Veiculo veiculo;
    private int diasContratados;
    private int diasUtilizados;
    private boolean atrasado;

    public void inicializar(Cliente cliente, Veiculo veiculo, int diasContratados) {
        if (veiculo.isAlugado()) {
            System.out.println("Erro! Veiculo já alugado!");
            return;
        }

        if (diasContratados< 1 || diasContratados> 30) {
            System.out.println("Erro! Dias devem ser entre 1 e 30");
            return;
        }

        this.cliente = cliente;
        this.veiculo = veiculo;
        this.diasContratados = diasContratados;
        atrasado = false;

        veiculo.marcarComoAlugado();
        System.out.println("Veículo alugado com sucesso!");
    }

    public void registrarDevolucao(int diasUtilizados){
        this.diasUtilizados = diasUtilizados;
        if (this.diasUtilizados > diasContratados) {
            atrasado = true;
        } else {
            atrasado = false;
        }
    }

    public double calcularValorTotal() {
        double valorbase = diasUtilizados * veiculo.getValorDiaria();
        if  (this.atrasado) {
            int diasAcumulados = (this.diasUtilizados- this.diasContratados);
            double multa = 50 + (diasAcumulados * 20);
           return valorbase + multa;
        }
        return valorbase;
    }

    public void exibirComprovante() {
        System.out.println("----COMMPROVANTE-----");
        cliente.exibirResumo();
        veiculo.exibirDetalhes();
        System.out.println("Dias contratados: " + this.diasContratados);
        System.out.println("Dias utilizados: " + this.diasUtilizados);
        System.out.println("Status: " + this.atrasado);
        System.out.println("Valor total calculado: " + this.calcularValorTotal());
    }
}
