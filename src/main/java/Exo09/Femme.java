package Exo09;

import java.security.SecureRandom;
import java.util.Random;

import static Exo03b.Color.*;

public class Femme extends Personne implements Sens {
    private boolean estEnceinte;
    public Main.SEXE sexe = Main.SEXE.Femme;
    private static int nbPersonnes = 0;


    public Femme(String prenom) {
        super(prenom);
        this.e = "e";
        nbPersonnes++;
    }

    public Femme(String nom, String prenom) {
        super(nom, prenom);
        this.e = "e";
        nbPersonnes++;
    }

    public Femme(String nom, String prenom, boolean estEnceinte) {
        super(nom, prenom);
        this.estEnceinte = estEnceinte;
        this.e = "e";
        nbPersonnes++;
    }

    public void accoucher() {
        if (this.estEnceinte) {
            Random rand = new SecureRandom();
            int gender = rand.nextInt(2);

            System.out.println("J'accouche");
            if (gender == 0) {
                System.out.println(ANSI_RED + "C'est une fille" + ANSI_RESET);
            } else {
                System.out.println(ANSI_BLUE + "C'est un garçon" + ANSI_RESET);
            }

            this.estEnceinte = false;
        } else {
            System.out.println("Je ne peux pas accoucher parce que je ne suis pas enceinte");
        }
    }

    public void setEstEnceinte(boolean estEnceinte) {
        this.estEnceinte = estEnceinte;
    }

    public void verifEstEnceinte() {
        if (estEnceinte) {
            System.out.println("Je suis enceinte");
        } else {
            System.out.println("Je ne suis pas enceinte");
        }
    }

    public static void quiEstTu() {
        System.out.println("Je suis une femme");
    }

    public static void afficherNbPersonnes() {
        if (nbPersonnes < 2) {
            System.out.printf("Il y a %d femme\n", nbPersonnes);
        } else {
            System.out.printf("Il y a %d femmes\n", nbPersonnes);
        }
    }


    @Override
    public void voir() {
        System.out.println("Je vois tout");
    }

    @Override
    public void entendre() {
        System.out.println("J'entends tout");
    }
}
