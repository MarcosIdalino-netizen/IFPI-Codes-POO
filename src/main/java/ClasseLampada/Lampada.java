package ClasseLampada;

public class Lampada {

    private String comodo;
    private boolean ligada;

    public Lampada(String comodo, boolean ligada) {
        this.comodo = comodo;
        this.ligada = ligada;
    }

    public void cadastrar(String comodo) {
        this.comodo = comodo;
        ligada = false;
    }

    public void ligar() {
            this.ligada = true;
        System.out.println("A lampada do comodo " + comodo + "Foi Ligada!!");

    }

    public void desligar() {
            this.ligada = false;
        System.out.println("Lampada do comando " + comodo + "Apagada!");
    }

    public void exibirstatus() {
        System.out.println("-----ESTADO-----");
        System.out.println("Comodo: " + this.comodo);
        if (this.ligada == true) {
            System.out.println("Status: LIGADA");
        } else {
            System.out.printf("Status: DESLIGADA");
        }
    }
}
