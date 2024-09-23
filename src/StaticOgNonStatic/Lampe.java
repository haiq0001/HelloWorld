package StaticOgNonStatic;

public class Lampe {
    private boolean tændt;
    private static int antalLamper = 0;


    public Lampe(boolean tændt) {
        this.tændt = tændt;
        antalLamper++;

    }

    public Lampe() {
        this(false);

    }

    public void trykPåKontakt() {
        tændt = !tændt;

    }

    public static int getAntalLamper() {
        return antalLamper;

    }

    @Override
    public String toString() {
        return tændt ? "Lampen er tændt" : "Lampen er slukket";

    }
}



