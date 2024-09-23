package ArrayList;
import java.util.ArrayList;

    public class SkoleHold {
        private ArrayList<SkoleStuderende> hold;

        public void hold() {
            this.hold = new ArrayList<>();

        }

        // Metode til at tilføje studerende
        public void tilføjStuderende(SkoleStuderende studerende) {
            hold.add(studerende);

        }

        // Søgemetode
        public SkoleStuderende søgEfterStuderende(String navn) {
            for (SkoleStuderende studerende : hold) {
                if (studerende.getNavn().equalsIgnoreCase(navn)) {
                    return studerende;
                } else {
                    return null;
                }
            }

            @Override
            public String toString () {
                String result = "";
                for (SkoleStuderende studerende : hold) {
                    result += studerende.toString() + "\n";

                }

                return result;

            }
        }
    }



