package Exo08;

public class Homme extends Personne {
    public int longueurBarbe = 3;
    public Main.SEXE sexe = Main.SEXE.Homme;
    private static int nbPersonnes = 0;

    public Homme(String prenom) {
        super(prenom);
        nbPersonnes++;
    }

    public Homme(String nom, String prenom) {
        super(nom, prenom);
        nbPersonnes++;
    }

    public Homme(String nom, String prenom, int longueurBarbe) {
        super(nom, prenom);
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
}
