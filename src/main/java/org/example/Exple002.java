package org.example;
import java.util.Scanner;
public class Exple002 {
    static void main() {
        System.out.printf("Hello world! %n");
        Scanner IdentificacoNum = new Scanner(System.in);
        System.out.printf("Digite o primeiro num: %n");
        int num = IdentificacoNum.nextInt();
        int maior = num;
        int menor = num;

        for (int i = 2; i <=5; i++) {
            System.out.printf("Digite o número %d ", i);
            num = IdentificacoNum.nextInt();
           if (num > maior) {
               maior = num;
           }
           if (num < menor) {
               menor = num;
           }
        }
        System.out.printf("Maior número = %d%n", maior);
        System.out.printf("Menor número = %d%n", menor);
    }
}
