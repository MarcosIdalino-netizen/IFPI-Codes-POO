package Aluno;

public class Aluno {
    public int maricula;
    public String nome;
    public String curso;
    public double notaFinal;

    public void exibirDados() {
        System.out.println("=== DADOS ===");
        System.out.println("Matrícula:" + maricula);
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Nota final: " + notaFinal);
    }

    public void verificarAprovacao() {
        if (notaFinal >= 7.0) {
            System.out.println("Voçê foi aprovado! Nota: " + notaFinal);
        } else {
            System.out.println("Voçê foi reprovado! nota: " + notaFinal);
        }
    }
}
