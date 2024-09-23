package KlasserOgObjekter;

public class Menneske {
    private String navn;
    private Menneske ægtefælle;

    // Constructor til at oprette et menneske med navn
    public Menneske(String navn) {
        this.navn = navn;
        this.ægtefælle = null; // Ingen ægtefælle til at starte med
    }

    // Getter til at få ægtefælle
    public Menneske getÆgtefælle() {
        return ægtefælle;
    }

    // Setter til at sætte ægtefælle
    private void setÆgtefælle(Menneske ægtefælle) {
        this.ægtefælle = ægtefælle;
    }

    // Metode til at gifte sig med et andet menneske
    public void gifterSigMed(Menneske andenPerson) {
        // Tjekker om man forsøger at gifte sig med sig selv
        if (this == andenPerson) {
            System.out.println("Du kan ikke gifte dig med dig selv.");
            return;
        }

        // Hvis begge er single, bliver de gift
        if (this.ægtefælle == null && andenPerson.getÆgtefælle() == null) {
            this.setÆgtefælle(andenPerson);
            andenPerson.setÆgtefælle(this);
            System.out.println(this.navn + " er nu gift med " + andenPerson.navn);
        } else {
            System.out.println("En af personerne er allerede gift.");
        }
    }

    // Metode til at blive skilt
    public void bliverSkilt() {
        if (this.ægtefælle != null) {
            // Sæt ægtefælle til null for begge parter
            Menneske tidligereÆgtefælle = this.ægtefælle;
            this.setÆgtefælle(null);
            tidligereÆgtefælle.setÆgtefælle(null);
            System.out.println(this.navn + " og " + tidligereÆgtefælle.navn + " er nu skilt.");
        } else {
            System.out.println(this.navn + " er ikke gift.");
        }
    }

    // Metode til at få navnet på mennesket
    public String getNavn() {
        return navn;
    }
}

