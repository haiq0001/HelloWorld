package ArrayList;

import java.util.ArrayList;

public class BilGarage {
    private ArrayList<Bil> bilerne = new ArrayList<>();

    public void tilføjBil(Bil bil) {
        bilerne.add(bil);
    }

    public double beregnPrisForAlleBiler() {
        double samletPris = 0;
        for (Bil bil : bilerne) {
            samletPris += bil.getPris();
        }
        return samletPris;
    }
}





