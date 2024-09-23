package Beregner;

import java.util.Scanner;
public class Sentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int SENTINEL = -1;
        int sum = 0;

        System.out.print("Indtast de tal der skal lægges sammen, eller -1 for at stoppe: ");
        int userInput = scanner.nextInt();

        while (userInput != SENTINEL)
        { sum += userInput;
            System.out.println("Indtast næste tal eller -1 for at stoppe: ");
            userInput = scanner.nextInt(); }

        scanner.close();
        System.out.println("Summen af de indtastede tal er: " + sum);
    }
}









