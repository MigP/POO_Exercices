package Exo09;

import static Exo03b.Color.ANSI_RESET;
import static Exo04.Color.ANSI_RED;

public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected Personne fiance;
    protected boolean estFiance;
    protected String e;
    private static int nbPersonnes = 0;


    public Personne(String prenom) {
        this.prenom = prenom;
        nbPersonnes++;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        nbPersonnes++;
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
            this.fiance = personne;
            personne.fiance = this;
        }
    }

    public void repondreDemandeMariage(boolean reponse) {
        if (reponse) {
            System.out.println("La réponse est : oui");
            this.estFiance = true;
        } else {
            System.out.println("La réponse est : nom");
            this.fiance = null;
            this.fiance.fiance = null;
        }

        if (this.estFiance) {
            System.out.println("La réponse vérifiée est : oui");
        } else {
            System.out.println("La réponse vérifiée est : non");
        }
    }

    public void donnerStatutMariage() {
        if (this.estFiance) {
            System.out.printf("%s %s est fiancé%s à %s\n", this.prenom, this.nom, this.e, this.fiance.prenom);
        } else {
            System.out.printf("%s n'est pas fiancé%s\n", this.prenom, this.e);
        }
    }

    public static void quiEstTu() {
        System.out.println("Je suis une personne");
    }

    public static void afficherNbPersonnes() {
        if (nbPersonnes < 2) {
            System.out.printf("Il y a %d personne\n", nbPersonnes);
        } else {
            System.out.printf("Il y a %d personnes\n", nbPersonnes);
        }
    }

}
