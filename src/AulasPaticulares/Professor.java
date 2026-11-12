package AulasPaticulares;

public class Professor {

    private String nome;
    private String Diciplina;
    private double valorHora;

    public Professor(String nome, double valorHora, String diciplina) {
        this.nome = nome;
        this.valorHora = valorHora;
        Diciplina = diciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiciplina() {
        return Diciplina;
    }

    public void setDiciplina(String diciplina) {
        Diciplina = diciplina;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void mostarDados() {
        System.out.println("-----Dados do professor-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Discplina: " + this.getDiciplina());
        System.out.println("Valor por hora: " + this.getValorHora());
    }
}
