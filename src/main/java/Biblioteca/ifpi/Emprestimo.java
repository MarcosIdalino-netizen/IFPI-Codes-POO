package Biblioteca.ifpi;

public class Emprestimo {
    private Estudante estudante;
    private Exemplar exemplar;
    private int periodoSoliciatcao;
    private int peridoReal;
    private boolean atrasado;

    public void cadastrar(Estudante estudante, Exemplar exemplar, int periodoSoliciatcao) {
        if(exemplar.isEmprestado()) {
            System.out.println("Erro! O exemplar já está emprestado!");
            return;
        }

        if (periodoSoliciatcao <7 || periodoSoliciatcao >15) {
            System.out.println("Erro! O periodo de solicitação deve ser entre 7 e 15 dias");
            return;
        }

        this.estudante = estudante;
        this.exemplar = exemplar;
        this.periodoSoliciatcao = periodoSoliciatcao;
        this.atrasado = false;

        this.exemplar.marcarEmprestado();
        System.out.println("Exemplar emprestado com sucesso!");

    }

    public void registarDevolucao(int peridoReal) {
        this.peridoReal = peridoReal;
        if (this.peridoReal > this.periodoSoliciatcao) {
            this.atrasado = true;
        } else {
            this.atrasado = false;
        }
    }

    public double calcularValorTotal() {
        double valorBase = this.peridoReal * exemplar.getValorDiario();
        if (this.atrasado) {
            int diasAcumulados = this.peridoReal - this.periodoSoliciatcao;
            double valormulta = 2.0 + (diasAcumulados * 0.5);

            return valorBase + valormulta;
        }
        return valorBase;
    }

    public void mostarResultados() {
        System.out.println("----RESULTADOS----");
        estudante.exibirResumo();
        exemplar.MostarDetalhes();
        System.out.println("-----------------------");
        System.out.println("Periodo de solicitação: " + this.periodoSoliciatcao);
        System.out.println("Periodo Real: " + this.peridoReal);
        System.out.println("Valor total a pagar: " + this.calcularValorTotal());
        }
}
