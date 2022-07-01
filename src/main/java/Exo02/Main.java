package Exo02;

public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Jules");
        personne1.nom = "César";

        //personne1.prenom = "Verne";

        Personne personne2 = new Personne("D'Egypte", "Cleopatre");

        personne1.parler("Bonjour\n");
        personne1.sePresenter();
        System.out.println();
        personne2.parler("Bonjour\n");
        personne2.sePresenter();
    }
}
