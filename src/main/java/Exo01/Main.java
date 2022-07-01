package Exo01;

public class Main {
    public static void main(String[] args) {
        Personne personne = new Personne();
        personne.prenom = "Miguel";
        personne.nom = "Pinto";

        personne.parler("Bonjour\n");
        personne.sePresenter();
    }
}
