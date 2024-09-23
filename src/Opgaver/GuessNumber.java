package Opgaver;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = 5;
        int usersGuess = -1;

        System.out.print("Gæt venligst et tal mellem 1-10: ");

        while (usersGuess != numberToGuess) {
            usersGuess = scanner.nextInt();

            if (numberToGuess == usersGuess) {
                System.out.println("Tillykke, du gættede rigtigt! :-)");
            } else {
                System.out.print("Forkert nummer, prøv igen...");
            }



        }
    }
}
