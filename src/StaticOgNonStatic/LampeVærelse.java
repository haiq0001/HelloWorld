package StaticOgNonStatic;

import java.util.Random;

public class LampeVærelse {
    public static void main(String[] args) {
        Lampe skrivebordslampe = new Lampe(true);
        Lampe sengebordslampe = new Lampe(true);

        System.out.println(skrivebordslampe);
        skrivebordslampe.trykPåKontakt();
        System.out.println(skrivebordslampe);

        System.out.println(sengebordslampe);
        sengebordslampe.trykPåKontakt();
        System.out.println(sengebordslampe);

        System.out.println("Antal lamper: " + Lampe.getAntalLamper());

    }
}
