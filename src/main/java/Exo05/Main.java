package Exo05;

public class Main {
    public static void main(String[] args) {
        Femme femme = new Femme("D'Egypte", "Cléopatre");
        Homme homme = new Homme("César", "Jules");

        homme.demanderEnMariage(femme);
        femme.repondreDemandeMariage(true);
        femme.donnerStatutMariage();

    }

}
