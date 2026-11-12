package Inscricao.Ifpi;

public class Inscricao {


    private String nomeParcipante;
    private String categoria;
    private double valorBase;

    public Inscricao(String nomeParcipante, String categoria, double valorBase) {
        this.nomeParcipante = nomeParcipante;
        this.valorBase = valorBase;
        if (!categoria.equals("Estudante") && !categoria.equals("Profissional")) {
            System.out.println("Categoria inválida! Definida para Estudante ");
            this.categoria = "Estudante";
        } else {
            this.categoria = categoria;
        }

    }

    public double calcularValorFinal() {
        if (this.categoria.equals("Estudante") ) {
            return this.valorBase * 0.5;
        } else {
            return this.valorBase;
        }
    }

    public void exibirComprovante() {
        System.out.println("----COMPROVANTE----");
        System.out.println("Nome do participante: " + this.nomeParcipante);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Valor total: " + this.calcularValorFinal());
    }

}
