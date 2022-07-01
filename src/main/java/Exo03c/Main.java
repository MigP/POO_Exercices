package Exo03c;

import java.util.ArrayList;
import static Exo03c.Menu.interet;
import static Exo03c.Menu.quitter;

public class Main {
    static String[][] nomsHomme = new String[][] {{"John", "Yeakley"}, {"Jordan", "McIntyre"}, {"Roger", "Sanders"}, {"Joey", "Phillips"}, {"James", "Bannister"}};
    static String[][] nomsFemme = new String[][] {{"Jeannette", "Oakley"}, {"Sylvia", "Santoro"}, {"Julia", "Roberts"}, {"Bridget", "Fonda"}, {"Alicia", "Keys"}};
    static ArrayList<Femme> femmes = new ArrayList<>();
    static ArrayList<Homme> hommes = new ArrayList<>();
    static ArrayList<String> pretendantsAimes = new ArrayList<>();

    public static void main(String[] args) {
        Menu.demanderInteret();
        creerListesPretendants();
        do {
            Menu.afficherMessageAttente(interet);
            Menu.afficherPretendant(chercherProchainPretendant());
        } while (!quitter);
        Menu.afficherPretendantsAimes();

/*        femmes.get(0).sePresenter();
        System.out.println();
        System.out.println(femmes.size());
        femmes.remove(0);
        femmes.get(0).sePresenter();
        System.out.println();
        System.out.println(femmes.size());*/
    }

    static void creerListesPretendants() {
        if (interet.equals("1") || interet.equals("3")) {
            for (String[] strings : nomsHomme) {
                Homme homme = new Homme(strings[1], strings[0]);
                hommes.add(homme);
            }
        }

        if (interet.equals("2") || interet.equals("3")) {
            for (String[] strings : nomsFemme) {
                Femme femme = new Femme(strings[1], strings[0]);
                femmes.add(femme);
            }
        }
    }

    static ArrayList chercherProchainPretendant() {
        ArrayList<String> pretendant = new ArrayList<>();
        if (femmes.size() > 0) {
            pretendant.add(femmes.get(0).getPrenom() + " " + femmes.get(0).getNom());
            pretendant.add("femme");
            femmes.remove(0);
            return pretendant;
        } else if (hommes.size() > 0) {
            pretendant.add(hommes.get(0).getPrenom() + " " + hommes.get(0).getNom());
            pretendant.add("homme");
            hommes.remove(0);
            return pretendant;
        } else {
            pretendant.add("");
            pretendant.add("");
            return pretendant;
        }
    }

    static void ajouterPretendantAime(String pretendantName) {
        pretendantsAimes.add(pretendantName);
    }
}


