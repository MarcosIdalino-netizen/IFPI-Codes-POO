package Veiculo;

public class ProgramaVeiculo {

    static void main(String[] args) {

            Veiculo C1 = new Veiculo("", "", 0.0, 0.0);
            Veiculo C2 = new Veiculo("", "", 0.0, 0.0);

            C1.cadastrar("Q4OTS", "Hilúx");
            C2.cadastrar("3GJ8L", "Mitsubishi");

            C1.acelerar(60);
            C1.frear(10);
            C1.RegistrarViagem(70);
            System.out.println();

            C2.acelerar(40);
            C2.frear(20);
            C2.RegistrarViagem(50);
            System.out.println();

            C1.exibirPainel();
            System.out.println();
            C2.exibirPainel();

            C2.frear(100);
            C2.exibirPainel();




    }
}
