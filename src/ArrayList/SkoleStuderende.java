package ArrayList;

public class SkoleStuderende {
    private static String navn;
    private static String email;

    public SkoleStuderende(String navn, String email) {
        this.navn = navn;
        this.email = email;

    }

    //get
    public String getNavn() {
        return navn;

    }

    public String getEmail() {
        return email;

    }

    //set
    public void setNavn(String navn) {
        this.navn = navn;

    }

    public void setEmail(String email) {
        this.email = email;

    }

    // toString metode
    @Override
    public String toString() {
        return "Navn: " + navn + ", Email: " + email;

    }
}







