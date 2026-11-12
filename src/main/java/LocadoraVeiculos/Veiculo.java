package LocadoraVeiculos;

public class Veiculo {
        private String placa;
        private String modelo;
        private double valordiaria;
        private boolean disponivel;

        public double getValordiaria() {
            return valordiaria;
        }

        public String getModelo() {
            return modelo;
        }
        public boolean isDisponivel() {
            return disponivel;
        }



        public void cadastrar(String placa,  String modelo, double valordiaria) {
            this.placa = placa;
            this.modelo = modelo;
            this.valordiaria = valordiaria;
            disponivel = true;
        }

        public boolean alugar() {
            if (disponivel == true) {
                this.disponivel = false;
                System.out.println("Veículo alugado com sucesso!");
                return true;
            } else {
                System.out.println("Ops! O veículo já foi alugado!");
                return false;
            }
        }

        public boolean devolver() {
            if (this.disponivel == false) {
                this.disponivel = true;
                System.out.println("Veículo devolvido com sucesso!");
                return true;
            } else {
                System.out.println("Erro! Não é possível devolver, pois não há veiculo a devolver");
                return false;
            }
        }

        public void exibirFicha() {
            System.out.println("Placa: " + this.placa);
            System.out.println("Modelo: " + this.getModelo());
            System.out.println("Valor diária: " + this.getValordiaria());
            if (this.disponivel == true) {
                System.out.println("Disponibilidade: livre para alugar! ");
            } else {
                System.out.println("Disponibilidade: Em uso!");
            }
        }
    }
