package Exo04;

import static Exo03b.Color.ANSI_BLUE;
import static Exo03b.Color.ANSI_RESET;
import static Exo04.Color.ANSI_RED;

public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected Personne fiance;

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void sePresenter() {
        System.out.printf("Je m’appelle %s %s\n", this.prenom, this.nom);
    }

    public void parler(String phrase) {
        System.out.printf("%s %s dit : %s\n", this.nom, this.prenom, phrase);
    }

    public void demanderEnMariage(Personne personne) {
        if (personne == this) {
            System.out.println(ANSI_RED + "Vous ne pouvez pas vous demander en mariage !" + ANSI_RESET);
        } else {
            System.out.printf("Veux-tu m'épouser %s %s ?\n", personne.prenom, personne.nom);
        }
    }
}
