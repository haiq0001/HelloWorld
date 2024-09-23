package Beregner;

import java.util.Scanner;
public class Cashier {
    public static void main(String[] args) {
        System.out.print("Indtast venligst antal varer du vil scanne: ");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        double total = 0;

        for(int i=0; i<quantity; i++) {
            System.out.print("Indtast venligst varens pris: ");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();
        System.out.println("Det totale beløb er " + total + " DDK");
    }
}

