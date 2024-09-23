package Arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] ord = {"Hej", "med", "dig"};

        String resultat = "";
        for (String ordet : ord) {
            resultat += ordet + " ";

        }
            System.out.println(resultat.trim());
    }
}
