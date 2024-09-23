package KlasserOgObjekter;

public class BilChauffør {
    private String navn;

    // Constructor
    public BilChauffør(String navn) {
        this.navn = navn;
    }

    // toString-metode
    public String toString() {
        return "Chauffør: " + navn;
    }
}
