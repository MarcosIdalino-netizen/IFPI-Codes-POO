 package LocadoraVeiculos;

public class Aluguel {

    private int codigoAlugel;
    private Veiculo veiculo;
    private int diasAlugados;

    public void iniciairAluguel(int codigo, Veiculo veiculo, int dias) {
        if(veiculo.alugar()) {
            this.codigoAlugel = codigo;
            this.veiculo = veiculo;
            this.diasAlugados = dias;
        }
    }

    public double calcularValorTotal() {
        return diasAlugados * veiculo.getValordiaria();
    }

    public void exibirResumo() {
        System.out.println("Codigo Aluguel: " + this.codigoAlugel);
        System.out.println("Modelo veículo: " + veiculo.getModelo());
        System.out.println("Qtd de dias alugado: " + this.diasAlugados);
        System.out.println("Valor total: " + this.calcularValorTotal());
    }
}