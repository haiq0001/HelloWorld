package ArrayList;
import java.util.ArrayList;

public class SøgningOgRedigering {
    public static void main(String[] args) {
        // Array af heltal
        int[] array = {2, 5, 7, 4, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5};

        // Opret en tom ArrayList
        ArrayList<Integer> tabel2 = new ArrayList<>();

        // Brug et enhanced for-loop til at fylde ArrayListen
        for (int tal : array) {
            tabel2.add(tal);

        }
    }
}
