package fr.eni.ecole.quelMedecin.test;

import fr.eni.ecole.quelMedecin.bo.MedecinGeneraliste;

public class TestMedecin {

    public static void main(String[] args) {
        // Création des instances:
        MedecinGeneraliste malanicheMelanie = new MedecinGeneraliste("Malanice", "Mélanie", "02.28.03.17.28");
        MedecinGeneraliste bosapinEdmond = new MedecinGeneraliste("Bosapin", "Edmond", "+33 2 17 18 19 20");
        MedecinGeneraliste tableDjemila = new MedecinGeneraliste("Table", "Djémila", "03-04-05-06-07");
        // Affichage des médecins:
        System.out.println("-----");
        malanicheMelanie.afficher();
        System.out.println("-----");
        bosapinEdmond.afficher();
        System.out.println("-----");
        tableDjemila.afficher();
        System.out.println("-----");
        // Changement du numéro de téléphone:
        tableDjemila.setTelephone("07-06-05-04-03");
        // Changement du tarif:
        MedecinGeneraliste.setTarif(23);
        // Affichage des médecins:
        System.out.println("-----");
        malanicheMelanie.afficher();
        System.out.println("-----");
        bosapinEdmond.afficher();
        System.out.println("-----");
        tableDjemila.afficher();
        System.out.println("-----");
    }
}
