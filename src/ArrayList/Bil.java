package ArrayList;

public class Bil {
    private String farve;
    private int kilometer;
    private double pris;

    public Bil(String farve, int kilometer, double pris) {
        this.farve = farve;
        this.kilometer = kilometer;
        this.pris = pris;
    }

    public double getPris() {
        return this.pris;
    }

    @Override
    public String toString() {
        return "Bil [Farve: " + farve + ", Kilometer: " + kilometer + ", Pris: " + pris + "]";
    }
}

