package ClienteContaBancaria;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente() {
    }

    public void Cadastrar(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public void exibirDados() {
        System.out.println("------DADOS DO CLIENTE------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
    }

    public String getNome() {
        return nome;
    }
}
