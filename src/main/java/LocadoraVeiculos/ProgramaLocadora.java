package LocadoraVeiculos;

public class ProgramaLocadora {
    static void main(String[] args) {

        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();

        v1.cadastrar("GSJ5", "Fiat Uno", 50);
        v2.cadastrar("IOS53", "Toyata corolla", 100);

        Aluguel a1 = new Aluguel();
        Aluguel a2 = new Aluguel();

        a1.iniciairAluguel(202, v1, 3 );
        System.out.println();
        a1.exibirResumo();

        System.out.println();

        a1.iniciairAluguel(202, v1, 3 );

        v1.devolver();
        System.out.println();
        a1.iniciairAluguel(202, v1, 5 );

        v1.exibirFicha();
        System.out.println();
        v2.exibirFicha();
    }
}