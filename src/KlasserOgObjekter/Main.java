package KlasserOgObjekter;

public class Main {
    public static void main(String[] args) {
        Bil bil = new Bil("Sort", 10000, 450000);  // Opret en bil
        BilChauffør chauffør = new BilChauffør("Hamza");  // Opret en chauffør

        System.out.println(bil);  // Udskriv bilens detaljer

        if (bil.enChaufførSætterSigInd(chauffør)) {
            System.out.println(chauffør + " sidder nu i bilen.");
        } else {
            System.out.println("Der sidder allerede en chauffør i bilen.");
        }

        System.out.println("Hvem kører bilen? " + bil.hvemKørerBilen());

        BilChauffør tidligereChauffør = bil.chaufførenStigerUd();
        System.out.println(tidligereChauffør + " er nu steget ud.");
    }
}

