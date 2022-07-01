package Exo09;


public class Main {
    public static void main(String[] args) {
        Femme femme = new Femme("D'Egypte", "Cléopatre");
        Homme homme = new Homme("César", "Jules");

        Personne.quiEstTu();
        Femme.quiEstTu();
        femme.sePresenter();
        femme.voir();
        femme.entendre();

        Personne.quiEstTu();
        Homme.quiEstTu();
        homme.sePresenter();
        homme.voir();
        homme.entendre();
    }

    enum SEXE {
        Homme,
        Femme,
        X
    }
}
