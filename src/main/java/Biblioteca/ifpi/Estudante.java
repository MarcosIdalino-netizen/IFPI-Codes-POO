package Biblioteca.ifpi;

public class Estudante {

    private String nome;
    private int idade;
    private String sexo;
    private String disciplinas;

    public Estudante(String nome, int idade, String disciplinas, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.disciplinas = disciplinas;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void exibirResumo() {
        System.out.printf("----RESUMO DO ESTUDANTE----");
        System.out.println("Nome:" + this.getNome());
        System.out.println("Idade:" + this.idade);
        System.out.println("Sexo:" + this.sexo);
        System.out.println("Disciplina:" + this.disciplinas);
    }

}
