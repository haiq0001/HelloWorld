package SpilOgLege;

import java.util.Random;

public class Terning {
    private int MAX = 6;
    private int faceValue;
    private Random kast;

    public Terning() {
        kast = new Random();
        roll();

    } public void roll() {
        faceValue = kast.nextInt(MAX) + 1;

    } public int getFaceValue() {
        return faceValue;

    }
}
