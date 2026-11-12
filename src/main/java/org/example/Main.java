package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import  java.util.Scanner;
public class Main {
    static void main() {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 10: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + num*i);
        }
    }
}
