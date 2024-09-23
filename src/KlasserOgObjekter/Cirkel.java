package KlasserOgObjekter;

public class Cirkel {
    private double radius;

    public Cirkel(double radius) {
        this.radius = radius;
    }
    public double beregnAreal() {
        return Math.PI * radius * radius;
    }
}