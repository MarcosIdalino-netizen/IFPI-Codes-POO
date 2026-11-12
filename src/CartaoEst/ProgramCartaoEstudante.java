package CartaoEst;

public class ProgramCartaoEstudante {
    static void main(String[] args) {
        CartaoEstudante C1 = new CartaoEstudante("Marcos", 5,2.50);
        CartaoEstudante C2 = new CartaoEstudante("Junior", 10,1.50);
        CartaoEstudante C3 = new CartaoEstudante("Mateus", 15,1.0);
        CartaoEstudante C4 = new CartaoEstudante("Davi", 8,6);
        CartaoEstudante C5 = new CartaoEstudante("Francisca", 2,2.50);

        C1.passarNaCatraca();
        System.out.println();
        C2.passarNaCatraca();
        System.out.println();
        C3.passarNaCatraca();
        System.out.println();
        C4.passarNaCatraca();
        System.out.println();
        C5.passarNaCatraca();
        System.out.println();

        C1.exibirResultados();
        System.out.println();
        C2.exibirResultados();
        System.out.println();
        C3.exibirResultados();
        System.out.println();
        C4.exibirResultados();
        System.out.println();
        C5.exibirResultados();

        C5.recarregar(10);
        System.out.println();
        C5.passarNaCatraca();
        System.out.println();
        C5.exibirResultados();

    }
}
