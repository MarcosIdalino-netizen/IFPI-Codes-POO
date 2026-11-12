package LocacaoVeiculo;

public class LocadoraProgram {
    static void main(String[] args) {
        Cliente C1 = new Cliente("00813", "11458082393", "Marcos") ;
        Cliente C2 = new Cliente("58038580 ", "14929891",  "Jose");

        Veiculo v1 = new Veiculo();
        Veiculo v2 = new Veiculo();
        Veiculo v3 = new Veiculo();

        v1.cadastrar("HDJ30", "Corrola", 80);
        v2.cadastrar("HHD883", "Fiat", 150);
        v3.cadastrar("BCUE2", "Ford", 400);

        Locacao l1 = new Locacao();
        Locacao l2 = new Locacao();
        Locacao l3 = new Locacao();

        l1.inicializar(C1, v1, 15);
        l2.inicializar(C2, v2, 20);
        l3.inicializar(C1, v3, 25);

        l1.registrarDevolucao(10);
        l2.registrarDevolucao(19);
        l3.registrarDevolucao(32);

        l1.exibirComprovante();
        System.out.println();
        l2.exibirComprovante();
        System.out.println();
        l3.exibirComprovante();
    }
}
