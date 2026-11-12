package ContaEnergia;



public class ConataEnergia {

    private int numeroInstalacao;
    private String nomeCliente;
    private double consumoKwh;
    private double valorKwh;

    public ConataEnergia(String nomeCliente, int numeroInstalacao, double consumoKwh, double valorKwh) {
        this.nomeCliente = nomeCliente;
        this.numeroInstalacao = numeroInstalacao;
        this.consumoKwh = consumoKwh;
        this.valorKwh = valorKwh;
    }

    public void definirCliente(String nome, int numero) {
        this.nomeCliente = nome;
        this.numeroInstalacao = numero;
    }

    public void definirValorkwh(double valor) {
        if (valor > 0) {
            this.valorKwh = valor;
            System.out.println("Valor Kwh atualizado com sucesso!");
        } else {
            System.out.println("Inválido! o valor não pode ser nulo!");
        }
    }

    public void registrarConsumo(double kwh) {
        if (kwh >= 0) {
            this.consumoKwh += kwh;
        } else {
            System.out.println("Consumo inválido! O valor é negativo!");
        }
    }

    public double calcularValor() {
         return  this.consumoKwh * this.valorKwh;


    }

    public void exibirConta() {
        System.out.println("=== RESULTADOS ===");
        System.out.println("Nome do cliente: " + this.nomeCliente);
        System.out.println("Número da Instalação: " + this.numeroInstalacao);
        System.out.println("Valor Kwh: " + this.valorKwh);
        System.out.println(" Consumo total: " + this.consumoKwh);
        System.out.println(" Valor a pagar: " + calcularValor());

    }
}
