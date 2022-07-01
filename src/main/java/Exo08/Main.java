package Exo08;


public class Main {
    public static void main(String[] args) {
        Personne.afficherNbPersonnes();
        Femme femme = new Femme("D'Egypte", "Cléopatre");
        Personne.afficherNbPersonnes();
        Homme homme = new Homme("César", "Jules");
        Homme homme2 = new Homme("Césaré", "Julesé");
        Personne.afficherNbPersonnes();
        Homme.afficherNbPersonnes();
        Femme.afficherNbPersonnes();
    }

    enum SEXE {
        Homme,
        Femme,
        X
    }
}
