package Loops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean okay = false;

        while (!okay) {
            System.out.print("Indtast et heltal: ");
            if (scanner.hasNextInt()) {
                okay = true;
            } else {
                okay = false;
                scanner.next();
                System.out.println("Du har ikke indtastet et heltal.");
            }
        }
                int number = scanner.nextInt();
                System.out.println("Tak");
            }
        }
