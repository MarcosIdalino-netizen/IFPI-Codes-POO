package AulasPaticulares;

public class AulaParticular {

    private int Codigo;
    private String data;
    private Professor professor;
    private double qtd_horas;
    private double valorTotal;

    public AulaParticular(int codigo, String data, Professor professor, double qtd_horas) {
        Codigo = codigo;
        this.data = data;
        this.professor = professor;

        if (qtd_horas <= 0) {
            System.out.println("Qtd hora inválidade! Padrão definido para 1 hora");
            this.qtd_horas = 1;
        } else {
            this.qtd_horas = qtd_horas;
        }

        this.valorTotal = qtd_horas * professor.getValorHora();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public double getQtd_horas() {
        return qtd_horas;
    }

    public void setQtd_horas(double qtd_horas) {
        this.qtd_horas = qtd_horas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double calculaValorTotal() {
        return this.valorTotal = (qtd_horas * professor.getValorHora());
    }

    public double aplicarDesconto() {
        double des = this.valorTotal * 0.10;
        this.valorTotal = this.valorTotal - des;
        return this.valorTotal;
    }

    public double aplicarDDesconto(double percentual) {
        return this.valorTotal = this.valorTotal - (this.valorTotal * percentual);
    }

    public void exibirRelatorio() {
        professor.mostarDados();
        System.out.println("-------------------------");
        System.out.println("Codigo: " + this.Codigo);
        System.out.println("Data: " + this.getData());
        System.out.println("quantidade de horas: " + this.getQtd_horas());
        System.out.println("Valor total: " + this.valorTotal);
    }
}
