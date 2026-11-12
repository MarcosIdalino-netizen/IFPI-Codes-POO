package Biblioteca.ifpi;

public class Exemplar {

    private String tipo;
  private String descricao;
  private double valorDiario;
  private boolean emprestado;

    public void cadastrar(String tipo, String descricao, double valorDiario) {
        this.tipo = tipo;
        this.descricao = descricao;

        if (this.valorDiario <= 2.0) {
            this.valorDiario = valorDiario;
        } else {
            System.out.println("Erro! O valor não pode ser maior que 2");
            this.valorDiario = 2.0;
        }

        this.emprestado = false;
    }

    public void marcarEmprestado() {
        this.emprestado = true;
    }

    public void marcarDevolvido() {
        this.emprestado = false;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public double getValorDiario() {
        return valorDiario;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void MostarDetalhes() {
        System.out.println("----DETALHES DO EXEMPLAR----");
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Valor diario: " + this.valorDiario);
        if (this.emprestado) {
            System.out.println("Situação: EMPRESTADO");
        } else {
            System.out.println("Situação: DISPONíVEL");
        }
    }
}
