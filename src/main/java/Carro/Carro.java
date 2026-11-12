package Carro;

import jdk.swing.interop.SwingInterOpUtils;

public class Carro {
    private String modelo;
    private double combustivel;
    private double capacidadeTanque;

    public Carro(String modelo, double Combustivel, double capacidadeTanque) {
        this.modelo = modelo;
        this.combustivel = combustivel;
        this.capacidadeTanque = capacidadeTanque;

    }

    void abastecer(double litros) {
        if (litros > 0) {
            if ((this.combustivel + litros) >= capacidadeTanque) {
                double espacoLivre = this.capacidadeTanque - this.combustivel;
                double sobra = litros - espacoLivre;
                this.combustivel = this.capacidadeTanque;
                System.out.println("Tanque cheio! entraram " + espacoLivre + "L e sobraram " + sobra + "L");
            } else {
                this.combustivel += litros;
                System.out.println("Abastecido cheio com sucesso! quantidade atual " + this.capacidadeTanque + "L");
            }
        } else {
                System.out.println("Quantidade litros inválida!");
        }
    }
    boolean dirigir(double distanciaKM) {
        double LitroNecessario = distanciaKM /10;
        if (this.combustivel >= LitroNecessario) {
            this.combustivel -=LitroNecessario;
            System.out.println("Viajem concluída com sucesso!");
            return true;
        } else {
            System.out.println("Combustível insuficiente para percorrer a viajem!");
            return false;
        }
    }

    void exibirStatus() {
        System.out.println("==== STATUS DO VÉICULO====");
        System.out.println("Modelo do carro: "+ this.modelo);
        System.out.println("Combutível disponível: "+ this.combustivel);
        System.out.println("Capacidade do tanque: "+ this.capacidadeTanque);
    }
}
