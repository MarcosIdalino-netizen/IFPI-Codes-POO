package SIstemaCarro;

public class ProgramaCarro {
    static void main(String[] args) {

        System.out.println("=======Testando o carro 1:=======");
        Carro c1 = new Carro();

        c1.irPraDireita();
        c1.irPraDireita();
        c1.mostrarPosicao();
        c1.irParaDireita(5);
        c1.mostrarPosicao();
        c1.irParaEsquerda(2);
        c1.mostrarPosicao();
        c1.irParaDireita(5);
        c1.mostrarPosicao();
        c1.irPraDireita();
        // verificando a posição final;
        c1.mostrarPosicao();
        System.out.println("------------------------------------------------------------");

        System.out.println("======Testando o carro 2======");
        Carro c2 = new Carro();
        c2.irParaEsquerda(1);
        c2.mostrarPosicao();
        c2.irParaEsquerda(6);
        c2.mostrarPosicao();
        c2.irParaDireita(3);
        c2.mostrarPosicao();
        c2.irParaEsquerda(3);
        c2.mostrarPosicao();
        c2.irParaEsquerda(5);
        //Confirmando a posição do carro 2.
       c2.mostrarPosicao();
    }
}
