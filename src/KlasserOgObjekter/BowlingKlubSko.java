package KlasserOgObjekter;

public class BowlingKlubSko {
    public static void main(String[] args) {
        Person navn1 = new Person("Hamza", "Iqbal", 46 );
        Person navn2 = new Person("Kasper", "Persson", 45 );
        Person navn3 = new Person("Gustav", "Reumert", 44 );

        navn1.udskrivPerson();
        navn2.udskrivPerson();
        navn3.udskrivPerson();
    }
}
