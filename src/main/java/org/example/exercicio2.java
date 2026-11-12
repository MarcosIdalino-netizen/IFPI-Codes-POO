package org.example;
import java.util.Scanner;
public class exercicio2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int qtdpares = 0;
        int qtdimpares = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um número : " + i );
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                 qtdpares++;
                par = qtdpares;
            } else {
                 qtdimpares++;
                impar = qtdimpares;
            }
        }
        System.out.printf("Qtd de números pares = %d%n ", par);
        System.out.printf("Qtd de númros ímpares = %d%n ", impar);
    }
}
