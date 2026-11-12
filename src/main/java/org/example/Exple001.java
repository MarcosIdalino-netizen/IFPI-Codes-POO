package org.example;
import java.util.Scanner;
public class Exple001 {
    static void main() {
        System.out.printf("Hello world%n!");
        Scanner scanner = new Scanner(System.in);
        int somaTotal = 0;
        for (int i = 1; i <=100; i++) {
            if (i % 2 == 0) {
                somaTotal++;
            }
        }
        System.out.printf("Quantidade de números pares de 1 até 100 =" + somaTotal + "%n");
    }
}
