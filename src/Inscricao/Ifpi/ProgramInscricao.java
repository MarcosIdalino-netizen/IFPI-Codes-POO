package Inscricao.Ifpi;

public class ProgramInscricao {
    static void main(String[] args) {

        Inscricao I1 = new Inscricao("Marcos", "Estudante", 50.0);
        Inscricao I2 = new Inscricao("João", "Profissional", 35.0);
        Inscricao I3 = new Inscricao("Luana", "Operador", 520);

        I1.calcularValorFinal();
        I1.exibirComprovante();
        System.out.println();
        I2.calcularValorFinal();
        I2.exibirComprovante();
        System.out.println();
        I3.calcularValorFinal();
        I3.exibirComprovante();

    }
}
