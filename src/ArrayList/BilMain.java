package ArrayList;

public class BilMain {
    public static void main(String[] args) {
        BilGarage garage = new BilGarage();
        Bil bil1 = new Bil("Sort VW Golf 7", 50000, 250000);
        Bil bil2 = new Bil("Hvid VW Golf 7", 50000, 250000);

        garage.tilføjBil(bil1);
        garage.tilføjBil(bil2);

        double totalPris = garage.beregnPrisForAlleBiler();
        System.out.println("Bilernes totale pris er: " + totalPris + " DDK");
    }
}



