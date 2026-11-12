package Biblioteca.ifpi;

public class BibliotecaProgram {
    static void main(String[] args) {

        Estudante est1 = new Estudante("Marcos", 18, "Matematica", "Masculino");
        Estudante est2 = new Estudante("Luana", 19, "Portuguese", "Feminino");
        Estudante est3 = new Estudante("Davi", 10, "Geografia", "Masculino");

        Exemplar Exem1 = new Exemplar();
        Exemplar Exem2 = new Exemplar();
        Exemplar Exem3 = new Exemplar();
        Exemplar Exem4 = new Exemplar();
        Exemplar Exem5 = new Exemplar();

        Exem1.cadastrar("Livro", "Java", 1.50);
        Exem2.cadastrar("Livro", "Python", 2.0);
        Exem3.cadastrar("Livro", "POO", 1.20);
        Exem4.cadastrar("Livro", "Estrutura de dados", 1.0);
        Exem5.cadastrar("Livro", "Banco de Dados", 1.30);

        est1.exibirResumo();
        System.out.println();
        est2.exibirResumo();
        System.out.println();
        est3.exibirResumo();

        Exem1.MostarDetalhes();
        System.out.println();
        Exem2.MostarDetalhes();
        System.out.println();
        Exem3.MostarDetalhes();
        System.out.println();
        Exem4.MostarDetalhes();
        System.out.println();
        Exem5.MostarDetalhes();

        Emprestimo em1 = new Emprestimo();
        Emprestimo em2 = new Emprestimo();
        Emprestimo em3 = new Emprestimo();
        Emprestimo em4 = new Emprestimo();
        Emprestimo em5 = new Emprestimo();

        em1.cadastrar(est1, Exem1, 8);
        em2.cadastrar(est1, Exem2, 15);
        em3.cadastrar(est2, Exem3, 12);
        em4.cadastrar(est2, Exem4, 14);
        em5.cadastrar(est1, Exem5, 12);

        em1.registarDevolucao(7);
        em2.registarDevolucao(17);
        em3.registarDevolucao(10);
        em4.registarDevolucao(14);
        em5.registarDevolucao(16);

        em1.mostarResultados();
        System.out.println();
        em2.mostarResultados();
        System.out.println();
        em3.mostarResultados();
        System.out.println();
        em4.mostarResultados();
        System.out.println();
        em5.mostarResultados();
    }
}
