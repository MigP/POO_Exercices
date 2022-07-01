package Exo10;

import java.time.LocalDate;

public class Homme extends Personne implements Sens {
    public int longueurBarbe = 3;
    public Main.SEXE sexe = Main.SEXE.Homme;
    private static int nbPersonnes = 0;

    public Homme(String prenom, LocalDate dateNaissance) {
        super(prenom, dateNaissance);
        nbPersonnes++;
    }

    public Homme(String nom, String prenom, LocalDate dateNaissance) {
        super(nom, prenom, dateNaissance);
        nbPersonnes++;
    }

    public Homme(String nom, String prenom, LocalDate dateNaissance, int longueurBarbe) {
        super(nom, prenom, dateNaissance);
        this.longueurBarbe = longueurBarbe;
        nbPersonnes++;
    }

    public void seRaser() {
        this.longueurBarbe = 0;
    }

    public void setLongueurBarbe(int longueurBarbe) {
        this.longueurBarbe = longueurBarbe;
    }

    public void getLongueurBarbe() {
        System.out.printf("Ma barbe fait: %s cm\n", this.longueurBarbe);
    }

    public static void quiEstTu() {
        System.out.println("Je suis un homme");
    }

    public static void afficherNbPersonnes() {
        if (nbPersonnes < 2) {
            System.out.printf("Il y a %d homme\n", nbPersonnes);
        } else {
            System.out.printf("Il y a %d hommes\n", nbPersonnes);
        }
    }

    @Override
    public void voir() {
        System.out.println("Je vois loin");
    }

    @Override
    public void entendre() {
        System.out.println("J'entends à ma façon");
    }
}
