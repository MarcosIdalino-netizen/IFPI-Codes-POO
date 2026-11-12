package ClasseLampada;

public class LampadaMain {
    static void main(String[] args) {
        Lampada L1 = new Lampada("Quarto", false);

        L1.exibirstatus();
        System.out.println();

        L1.ligar();
        L1.exibirstatus();
        System.out.println();

        L1.desligar();
        L1.exibirstatus();
        System.out.println();
    }
}
