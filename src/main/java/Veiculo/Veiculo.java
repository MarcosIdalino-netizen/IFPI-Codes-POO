package Veiculo;

public class Veiculo {
    private String placa;
    private String modelo;
    private double velocidade;
    private double quilometragem;

    public Veiculo(String placa, String modelo, double velocidade, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.quilometragem = quilometragem;
    }

    public void cadastrar(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public void acelerar(double valor) {
        if (valor > 0) {
            this.velocidade += valor;
            System.out.println("Acelerando...");
        } else {
            System.out.println("Não é possível acelerar!");
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            if (valor >= this.velocidade) {
                this.velocidade = 0;
                System.out.println("Veículo parou completamente!");
            } else {
                this.velocidade -= valor;
                System.out.println("Reduzindo velocidade...");
            }
        } else {
            System.out.println("Não é possível reduzir a velocidade");
        }
    }

    public void RegistrarViagem(double km) {
        if (km > 0) {
            this.quilometragem += km;
            System.out.println("Quilometragem Aumentada!");
        } else {
            System.out.println("Erro! Valor negativo.");
        }
    }

    public void exibirPainel() {
        System.out.println("====== DADOS DO VEÍCULO======");
        System.out.println("Placa do veículo: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade atual " + this.velocidade + "Kw/h");
        System.out.println("Quilometragem: " + this.quilometragem);
    }
}

