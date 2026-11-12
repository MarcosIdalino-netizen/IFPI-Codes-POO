package ClinicaMedica;

public class Consulta {
    private int idConsulta;
    private String paciente;
    private Medico medico;
    private boolean paga;

    public void agendarConsulta(int idConsulta, String paciente, Medico medico) {
        if (medico.isAtendendo() ==  true)  {
            this.idConsulta = idConsulta;
            this.paciente = paciente;
            this.medico = medico;
            paga = false;
            System.out.println("Consulta marcada!");
        } else {
            System.out.println("Erro! O medico não está disponivel");
        }
    }

    public void realizarPagamento() {
        if (this.paga == false) {
            this.paga = true;
            System.out.println("Pagamento realizado!");
            System.out.println("Valor: " + medico.getValorConsulta());
        } else {
            System.out.println("Essa consulta já encotra-se paga");
        }
    }

    public void exibirComprovante() {
        System.out.println("ID da consulta: " + this.idConsulta);
        System.out.println("nome do paciente: " + this.paciente);
        System.out.println("CRM: " + medico.getCrm());
        System.out.println("Nome do Medico: " + medico.getNome());
        System.out.println("Valor consulta: " + medico.getValorConsulta());
        if (this.paga) {
            System.out.println("Status de pagamento: PAGO");
        } else {
            System.out.println("Status de pagamento: PENDENTE" );
        }
    }
}
