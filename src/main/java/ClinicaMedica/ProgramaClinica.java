package ClinicaMedica;

public class ProgramaClinica {
    static void main(String[] args) {
    Medico M1 = new Medico();
    Medico M2 = new Medico();

    M1.cadastrar("492", "Dr.Calors", 50.0);
    M2.cadastrar("053", "Dra.Ana", 100);

    M2.mudarStatusAtendimento(false);

    Consulta C1 = new Consulta();
    Consulta C2 = new Consulta();

    C1.agendarConsulta(89, "Marcos", M2);
        System.out.println();
    C2.agendarConsulta(21, "Marcos", M1);
        System.out.println();
    C2.exibirComprovante();
        System.out.println();
        C2.realizarPagamento();
    }
}
