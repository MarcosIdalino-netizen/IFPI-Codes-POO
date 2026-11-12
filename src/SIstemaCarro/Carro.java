package SIstemaCarro;

public class Carro {
    private int posicao;

    public Carro (){}

    public void irPraDireita() {
        if (this.posicao + 1 > 10) {
            System.out.println("Erro! Não pode passar de 10");
        } else {
            this.posicao += 1;
        }
    }

    public void irPraEsquerda() {

        if (this.posicao - 1 < -10) {
            System.out.println("Erro! Não pode passar de 10");
        } else {
            this.posicao -= 1;
        }
    }

    public void irParaDireita(int passos) {

        if (passos <= 0 ) {
            System.out.println("Erro! A quantidade de passos devem ser maior que zero");
        }
        if (this.posicao + passos > 10) {
            System.out.println("Erro! O movimento ultrapassa os limites permitidos (10 e -10) Posição mantida!");

        } else {
            this.posicao += passos;
        }
    }

    public void irParaEsquerda(int passos) {
         if (passos <= 0 ) {
            System.out.println("Erro! A quantidade de passos devem ser maior que zero");
        }
        if ( this.posicao - passos < -10) {
            System.out.println("Erro! O movimento ultrapassa os limites permitidos (10 e -10) Posição mantida!");

        } else {
            this.posicao -= passos;
        }
    }

    public void mostrarPosicao() {
        System.out.println("Posicao atual: " + this.posicao);
    }

}
