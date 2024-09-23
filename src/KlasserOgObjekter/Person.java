package KlasserOgObjekter;

public class Person {
    private String fornavn;
    private String efternavn;
    private double skoStr;

    public Person(String fornavn, String efternavn, double skoStr) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.skoStr = skoStr;

    }

    public void udskrivPerson() {
        System.out.println("Navn: " + fornavn + " " + efternavn + ". Skostørrelse: " + skoStr);
    }

    @Override
    public String toString() {
        return ("Navn: " + fornavn + " " + efternavn + ". Skostørrelse: " + skoStr);
    }
}
