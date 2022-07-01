package Exo03b;

public abstract class Personne {
    protected String nom;
    protected String prenom;

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void sePresenter() {
        System.out.printf("Je m’appelle %s %s", this.prenom, this.nom);
    }

    public void parler(String phrase) {
        System.out.printf("%s %s dit : %s", this.nom, this.prenom, phrase);
    }
}
