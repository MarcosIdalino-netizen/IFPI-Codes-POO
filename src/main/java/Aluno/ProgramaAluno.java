package Aluno;

public class ProgramaAluno {
    static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.maricula = 2026005;
        a1.nome = "Marcos";
        a1.curso = "ADS";
        a1.notaFinal = 6.0;

        System.out.println("=== INFORMAÇÕES DO ALUNO 1: ===");
        a1.exibirDados();
        a1.verificarAprovacao();

        Aluno a2 = new Aluno();
        a2.maricula = 2026006;
        a2.nome = "Mateus";
        a2.curso = "ADM";
        a2.notaFinal = 7.0;

        System.out.println("=== INFORMAÇÕES DO ALUNO 2: ===");
        a2.exibirDados();
        a2.verificarAprovacao();

    }

}
