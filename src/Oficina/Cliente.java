package Oficina;

public class Cliente {

    private String nomeCompleto;
    private String CPF;
    private String Telefone;

    public Cliente(String nomeCompleto, String CPF, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        Telefone = telefone;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void exibirCliente() {
        System.out.println("----DADOS CLIENTE----");
        System.out.println("Nome Completo: " + this.getNomeCompleto());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Telefone: " + this.getTelefone());
    }
}
