package KlasserOgObjekter;

public class Bil {
    private String farve;
    private int kilometer;
    private double nypris;
    private BilChauffør chauffør; // Chauffør-objekt

    // Constructor
    public Bil(String farve, int kilometer, double nypris) {
        this.farve = farve;
        this.kilometer = kilometer;
        this.nypris = nypris;
        this.chauffør = null; // Ingen chauffør til at starte med
    }

    // Metode til at køre bilen
    public void kør(int antalKilometer) {
        this.kilometer += antalKilometer;
    }

    // Metode til at returnere bilens nypris
    public double nypris() {
        return this.nypris;
    }

    // toString-metode til at give en beskrivelse af bilen
    public String toString() {
        return "Bil: " + farve + ", kørte kilometer: " + kilometer + ", nypris: " + nypris + " DKK";
    }

    // Metode til at sætte en chauffør i bilen
    public boolean enChaufførSætterSigInd(BilChauffør c) {
        if (this.chauffør == null) {
            this.chauffør = c;
            return true;
        }
        return false;
    }

    // Metode til at returnere hvem der kører bilen
    public BilChauffør hvemKørerBilen() {
        return this.chauffør;
    }

    // Metode til at få chaufføren til at stige ud af bilen
    public BilChauffør chaufførenStigerUd() {
        BilChauffør tidligereChauffør = this.chauffør;
        this.chauffør = null;
        return tidligereChauffør;
    }
}