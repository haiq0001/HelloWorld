package Arrays;

public class IterateThroughArray {
    public static void main(String[] args) {


 /* double[] tal = {4.5, 25.3, 12.1, 34.0, 15.5};

    for (int i = 0; i < tal.length; i++) {
    double kvadrat = Math.pow(tal[i], 2);

    System.out.println(tal[i] + " i anden potens er " + kvadrat);
        }
    }
}
*/

        double[] tal = {4.5, 25.3, 12.1, 34.0, 15.5};
        double mindsteværdi = tal[0];

        for (int i = 1; i < tal.length; i++) {
            if (tal[i] < mindsteværdi) {
                mindsteværdi = tal[i];


            }
        }
    }
}




