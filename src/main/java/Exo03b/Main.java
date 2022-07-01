package Exo03b;

public class Main {
    public static void main(String[] args) {
        Femme femme = new Femme("D'Egypte", "Cléopatre");

        femme.parler("Bonjour\n");
        femme.sePresenter();
        System.out.println();
        femme.verifEstEnceinte();
        femme.setEstEnceinte(true);
        femme.verifEstEnceinte();
        femme.accoucher();
        femme.verifEstEnceinte();
        femme.accoucher();

    }
}
