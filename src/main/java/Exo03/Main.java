package Exo03;

public class Main {
    public static void main(String[] args) {
        Homme homme = new Homme("César", "Jules");

        homme.parler("Bonjour\n");
        homme.sePresenter();
        System.out.println();
        homme.getLongueurBarbe();
        homme.seRaser();
        homme.getLongueurBarbe();
    }
}
