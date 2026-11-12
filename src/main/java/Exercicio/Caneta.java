package Exercicio;

public class Caneta {

     public String modelo;
     public String cor;
     private float ponta;
     protected int carga;
     private boolean tampada;

   public void rabiscar() {
    if (this.tampada == true) {
        System.out.println("Não pode rabiscar! A caneta está tampada");
       } else {
        System.out.println("Rabiscando.....");
      }
    }

   protected void tampar () {
    this.tampada = true;
    }

   protected void destampar() {
    this.tampada = false;
    }

    public void status() {
        System.out.println("----STATUS CANETA-----");
        System.out.println("modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Estado: " + this.tampada);
        System.out.println("Carga: " + this.carga);

    }
}
