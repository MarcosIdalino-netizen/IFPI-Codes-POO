package org.example;
import java.util.Scanner;
public class exenole01 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Hello world!%n");
        System.out.printf("Digite n1: %n");
        int  n1 = scanner.nextByte();

        System.out.printf("Digite n2: %n");
        int n2 = scanner.nextByte();
        int media;

        media = (n1 + n2)/2;
        System.out.printf("A média das notas é igual a: %n"+ media);

    }
}
