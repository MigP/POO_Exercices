package Exo07;

public class Main {
    public static void main(String[] args) {
        Femme femme = new Femme("D'Egypte", "Cléopatre");
        Homme homme = new Homme("César", "Jules");

        System.out.println(homme.sexe);
        System.out.println(femme.sexe);
    }

    enum SEXE {
        Homme,
        Femme,
        X
    }
}
