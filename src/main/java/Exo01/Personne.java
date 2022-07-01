package Exo01;

public class Personne {
    public String nom;
    public String prenom;

    public void sePresenter() {
        System.out.printf("Je m’appelle %s %s", this.prenom, this.nom);
    }

    public void parler(String phrase) {
        System.out.printf("%s %s dit : %s", this.nom, this.prenom, phrase);
    }
}
