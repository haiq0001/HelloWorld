package ArrayList;
import java.util.ArrayList;

public class opgaverOver170cm {
        public static void main(String[] args) {
            // Liste over personers højder
            ArrayList<Double> højder = new ArrayList<>();
            højder.add(180.5);
            højder.add(165.2);
            højder.add(172.4);
            højder.add(169.9);
            højder.add(175.0);

            // Søgehøjde som streng
            String søgeHøjde = "170.0";

            // Konverterer søgehøjden fra String til double
            double minimumHøjde = Double.parseDouble(søgeHøjde);

            // Finder og udskriver personer, der er højere end 170 cm
            System.out.println("Personer der er højere end " + minimumHøjde + " cm:");
            for (double højde : højder) {
                if (højde > minimumHøjde) {
                    System.out.println(højde + " cm");

                }
            }
        }
    }


