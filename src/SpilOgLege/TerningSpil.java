package SpilOgLege;

public class TerningSpil {
    public static void main(String[] args) {

        Terning terning1 = new Terning();
        Terning terning2 = new Terning();

        terning1.roll();
        terning2.roll();

        System.out.println("Terning 1 slår: " + terning1.getFaceValue());
        System.out.println("Terning 2 slår: " + terning2.getFaceValue());

    }
}
