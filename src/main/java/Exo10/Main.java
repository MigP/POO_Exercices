package Exo10;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Femme femme = new Femme("D'Egypte", "Cléopatre", LocalDate.of(1977, 5, 25));
        Homme homme = new Homme("César", "Jules", LocalDate.of(1974, 10, 6));

        femme.afficherAge();
        homme.afficherAge();
    }

    enum SEXE {
        Homme,
        Femme,
        X
    }
}
