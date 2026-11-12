package AulasPaticulares;

public class ProgramaAulaParticular {
    static void main(String[] args) {

        Professor p1 = new Professor("Maria", 80.00, "Matematica");
        Professor p2 = new Professor("João", 100.00, "Física");

        AulaParticular a1 = new AulaParticular(101, "10/11/2026", p1, 4);
        AulaParticular a2 = new AulaParticular(102, "11/11/2026", p1, 3);
        AulaParticular a3 = new AulaParticular(103, "12/11/2026", p2, 2);

        a1.exibirRelatorio();
        System.out.println();
        a2.exibirRelatorio();
        System.out.println();
        a3.exibirRelatorio();
        System.out.println("-----------------------------------------------------------------------------");

        a1.aplicarDesconto();
        a3.aplicarDDesconto(0.15);

        a1.exibirRelatorio();
        System.out.println();
        a2.exibirRelatorio();
        System.out.println();
        a3.exibirRelatorio();
        System.out.println("---------------------------------------------------------------------------------------------------------");

       double Sp1 = a1.getValorTotal();
       double Sp2 = a2.getValorTotal();
       double tp2 = a3.getValorTotal();
        double soma = Sp1 + Sp2;
        System.out.println("Total soma p1 = " + soma);
        System.out.println();
        System.out.println("Total do p2: " + tp2);

        if (soma > tp2) {
            System.out.println("Professor " + p1.getNome() + " teve maior faturamento de " + soma + "R$") ;
        } else {
            System.out.println("Professor" + p2.getNome() + "teve maior faturamento de " + tp2  + "R$");
        }

    }
}
