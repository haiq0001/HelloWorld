package Beregner;

import java.util.Scanner;
public class Portoberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pris = 0;

        System.out.print("Indtast venligst vægten i gram:");
        int vægt = input.nextInt();


        if (vægt < 0 || vægt > 2000)
            System.out.println("Et brev med denne vægt kan vi ikke sende");

        if (vægt <= 100)
        System.out.println("Prisen for at sende dette brev er 25kr");

        else if (vægt <= 250)
        System.out.println("Prisen for at sende dette brev er 50kr");

        else if (vægt <= 2000)
            System.out.println("Prisen for at sende dette brev er 75kr");












    }
}
