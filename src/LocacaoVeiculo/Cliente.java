package LocacaoVeiculo;

public class Cliente {

    private String nome;
    private String CPF;
    private String CNH;

    public Cliente(String CNH, String CPF, String nome) {
        this.CNH = CNH;
        this.CPF = CPF;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getCNH() {
        return CNH;
    }

    public void exibirResumo() {
        System.out.println("-----REESUMO CLIENTE-----");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCPF());
        System.out.println("CNH: " + getCNH());
    }
}
