package LocacaoVeiculo;

public class Veiculo {

    private String placa;
    private String modelo;
    private double valorDiaria;
    private boolean alugado;


    public void cadastrar(String placa, String modelo, double valorDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        if (valorDiaria < 50.0 || valorDiaria > 300) {
            this.valorDiaria = 100.0;
            System.out.println("Aviso: Valor deve ser entre 50 e 300. Valor definido para 100!");
        } else {
            this.valorDiaria = valorDiaria;
            System.out.println("Valor da diária = " + valorDiaria + "R$");
        }
        this.alugado = false;
    }

    public void marcarComoAlugado() {
        this.alugado = true;
    }

    public void marcarComoDevolvido() {
        this.alugado = false;
    }

    public String getPlaca() {
        return placa;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirDetalhes() {
        System.out.println("----DETALHES DO VEICULO-----");
        System.out.println("PLACA: " + this.getPlaca());
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("VALOOR DIÁRIO: " + this.getValorDiaria());
        if (this.isAlugado()== true) {
            System.out.println("Veículo Alugado");
        } else {
            System.out.println("Veículo disponível");
        }
    }
}
