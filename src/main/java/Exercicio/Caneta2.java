package Exercicio;

public class Caneta2 {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

        public Caneta2(){
            this.tampar();
            this.cor = "AZUL";
        }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }


    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);

    }
}
