package Exo03c;

import java.util.ArrayList;
import java.util.Scanner;

import static Exo03c.Color.*;

public class Menu {
    static String interet;
    static boolean quitter;
    public static void demanderInteret() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Par quoi êtes-vous intéressé(e) ?");
        System.out.println("1 – Homme");
        System.out.println("2 – Femme");
        System.out.println("3 – Les deux");

        do {
            interet = myObj.nextLine();
            if(!interet.equals("1") && !interet.equals("2") && !interet.equals("3")) {
                System.out.println(ANSI_RED + "Erreur : choix inconnu" + ANSI_RESET);
            }
        } while(!interet.equals("1") && !interet.equals("2") && !interet.equals("3"));


    }

    public static void afficherMessageAttente(String choix) {
        if (choix.equals("1")) {
            System.out.println("Notre système recherche un homme");
        } else if (choix.equals("2")) {
            System.out.println("Notre système recherche une femme");
        } else {
            System.out.println("Notre système recherche un homme ou une femme");
        }
        System.out.println("Appuyer sur Q pour quitter, 1 pour aime, 0 pour n'aime pas");
    }

    public static void afficherPretendant(ArrayList pretendant) {
        if (pretendant.get(0).equals("") && pretendant.get(1).equals("")) {
            quitter = true;
        } else {
            if (pretendant.get(1).equals("femme")) {
                System.out.printf("La prétendante est : %s\n", pretendant.get(0));
            } else if (pretendant.get(1).equals("homme")) {
                System.out.printf("Le prétendant est : %s\n", pretendant.get(0));
            }

            String choix;
            Scanner myObj = new Scanner(System.in);
            do {
                choix = myObj.nextLine();
                if(!choix.equalsIgnoreCase("q") && !choix.equals("1") && !choix.equals("0")) {
                    System.out.println(ANSI_RED + "Erreur : choix inconnu" + ANSI_RESET);
                }

                if(choix.equalsIgnoreCase("q")) {
                    quitter = true;
                } else if (choix.equals("1")) {
                    Main.ajouterPretendantAime((String) pretendant.get(0));
                }
            } while(!choix.equalsIgnoreCase("q") && !choix.equals("1") && !choix.equals("0"));
        }
    }

    public static void afficherPretendantsAimes() {
        String listOfPersonnesAimes = "";

        System.out.println(ANSI_PURPLE + "Vous avez aimé :" + ANSI_RESET);
        for (int i = 0; i < Main.pretendantsAimes.size(); i++) {
            listOfPersonnesAimes += Main.pretendantsAimes.get(i);
            if (i  < Main.pretendantsAimes.size() - 1) {
                listOfPersonnesAimes += ", ";
            }
        }
        System.out.println(listOfPersonnesAimes);
        System.out.println("Amusez-vous bien et utilisez un préservatif !");
        System.out.println("A bientôt :-)");
    }
}
