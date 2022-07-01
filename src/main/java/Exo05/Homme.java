package Exo05;

public class Homme extends Personne {
    public int longueurBarbe = 3;

    public Homme(String prenom) {
        super(prenom);
    }

    public Homme(String nom, String prenom) {
        super(nom, prenom);
    }

    public Homme(String nom, String prenom, int longueurBarbe) {
        super(nom, prenom);
        this.longueurBarbe = longueurBarbe;
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
}
