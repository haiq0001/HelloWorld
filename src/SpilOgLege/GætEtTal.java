package SpilOgLege;
import java.util.Scanner;
import java.util.Random;

public class GætEtTal {
    public static void main(String[] args) {
        // Opretter et Scanner-objekt til at læse input fra spilleren
        Scanner scanner = new Scanner(System.in);
        // Opretter et Random-objekt til at generere det tilfældige tal
        Random random = new Random();

        // Vælg et tilfældigt tal mellem 1 og 100
        int korrektTal = random.nextInt(100) + 1;
        int gæt = 0;

        System.out.println("Velkommen til 'Gæt et tal'!");
        System.out.println("Vælg et tal mellem 1 og 100");

        // Fortsætter spillet indtil det korrekte tal er gættet
        while (gæt != korrektTal) {
            // Læser spillerens gæt
            System.out.print("Indtast dit gæt: ");
            gæt = scanner.nextInt();

            // Tjekker om gættet er for højt, for lavt eller korrekt
            if (gæt > korrektTal) {
                System.out.println("Dit gæt er for højt!");
            } else if (gæt < korrektTal) {
                System.out.println("Dit gæt er for lavt!");
            } else {
                System.out.println("Tillykke! Du gættede det rigtige tal: " + korrektTal);
            }
        }

        // Lukker scanner for at undgå ressource-læk
        scanner.close();
    }
}