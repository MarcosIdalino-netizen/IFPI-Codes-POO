package Oficina;

public class ProgramaOficina {
    static void main(String[] args) {

        Cliente c1 = new Cliente("Marcos Idalino De Sousa Filho", "1145291004", "869817743");
        Cliente c2 = new Cliente("Francisca Luana de Araujo Brito", "13258098230", "8692438876");

        OrdemServico S1 = new OrdemServico(c1, 2, "Consertar pneu", 100);
        OrdemServico S2 = new OrdemServico(c2, 6, "Troca de rodas", 150);
        OrdemServico S3 = new OrdemServico(c1, 5, "Ajeitar Porta carro", 300);

        S1.calcularValorTotal();
        S1.fechamentoServico();
        System.out.println();
        S2.calcularValorTotal();
        S2.fechamentoServico();
        System.out.println();
        S2.fechamentoServico();
        System.out.println();

        S1.exibirFatura();
        System.out.println();
        S2.exibirFatura();






    }
}
