package Carro;

public class ProgramaCarro {
    static void main(String[] args) {
         Carro c1 = new Carro("Hilúx", 0.00, 50.00);

         c1.dirigir(50);

         c1.abastecer(30);

         c1.dirigir(200);

         c1.abastecer(50);

         c1.exibirStatus();
    }
}
