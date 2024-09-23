package Opgaver;

import java.util.Scanner;
public class TommerTIlCentimeter {
    public static void main(String[] args) {

        System.out.println("Hej! Jeg er din tommer til centimeter beregner.");
        System.out.print("Indtast antal tommer her:");
        Scanner input = new Scanner(System.in);
        double tommer = input.nextInt();
        final double TOMMER_TIL_CENTIMETER = 2.54;

        System.out.println(tommer + " tommer svarer til " + TOMMER_TIL_CENTIMETER*tommer + " centimeter ");
        System.out.println("Jeg håber du kan bruge min hjælp, Hav en god dag!");







    }
}
