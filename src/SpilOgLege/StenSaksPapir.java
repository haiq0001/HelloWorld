package SpilOgLege;

import java.util.Scanner;
import java.util.Random;

public class StenSaksPapir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        String[] alleMulighederne = {"Sten", "Saks", "Papir"};

        System.out.println();

        System.out.println("Velkommen til sten, saks, papir spillet!");

        while (true) {

            System.out.println();

            System.out.print("Sten, Saks, Papir?: ");

            String spillerValg = scanner.nextLine();

            if (spillerValg.equalsIgnoreCase("slut")) {

                System.out.println("Spillet er afsluttet.");

                break;
            }
            boolean gyldigValg = false;

            for (String mulighed : alleMulighederne) {

                if (spillerValg.equalsIgnoreCase(mulighed)) {

                    gyldigValg = true;

                    break;

                }
                }

                if (!gyldigValg)

                {
                    System.out.println("Ugyldigt valg.");
                    continue;
                }

                int computerIndex = random.nextInt(3);
                String computerValg = alleMulighederne[computerIndex];
                System.out.println("Computer: " + computerValg);

                if (spillerValg.equalsIgnoreCase(computerValg))

                {
                    System.out.println("Uafgjort!");
                }

                else if (spillerValg.equalsIgnoreCase("Sten") && computerValg.equals("Saks") || spillerValg.equalsIgnoreCase("Saks") && computerValg.equals("Papir") || spillerValg.equalsIgnoreCase("Papir") && computerValg.equals("Sten"))

                {
                    System.out.println("Du vinder denne runde!");
                }

                else

                {
                    System.out.println("Computeren vinder denne runde!");
                }
            }
        }
    }





















