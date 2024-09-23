package SpilOgLege;

import java.util.Random;
public class TerningKast {
    public static void main(String[] args) {
        Random random = new Random();

        int sum = 0;

        while (sum != 7) {
            int terning1 = random.nextInt(1, 7);
            int terning2 = random.nextInt(1, 7);

            sum = terning1 + terning2;

            System.out.println(terning1 + " + " + terning2 + " = " + sum);
        }
    }

}
