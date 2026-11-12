package ClinicaMedica;

public class Medico {
    private String crm;
    private String nome;
    private double valorConsulta;
    private boolean atendendo;

    public boolean isAtendendo() {
        return atendendo;
    }

    public void setAtendendo(boolean atendendo) {
        this.atendendo = atendendo;
    }

    public Medico() {
    }

    public void cadastrar(String crm, String nome, double valorConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.valorConsulta = valorConsulta;
        atendendo = true;
    }

    public void mudarStatusAtendimento(boolean status) {
        this.atendendo = status;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public void exibirPerfil() {
        System.out.println("----PERFIL DO MEDICO----");
        System.out.println("CRM: " + this.getCrm());
        System.out.println("Nome : " + this.getNome());
        System.out.println("Valor consulta: " + this.getValorConsulta());
        if (atendendo == true) {
            System.out.println("Diponivel!");
        } else {
            System.out.println("Ops! o medico não está disponivel no momento");
        }
    }


}
