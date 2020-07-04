package fr.eni.ecole.quelMedecin.test;

import fr.eni.ecole.quelMedecin.bo.Patient;

import java.time.LocalDate;

public class TestPatient {
    public static void main(String[] args) {
        try {
            Patient vambuceHillary = new Patient(
                    "Vambuce",
                    "Hillary",
                    'F',
                    "0123456789",
                    287060244010154L,
                    LocalDate.of(1987, 6, 2),
                    "Allergies aux arachides"
            );
            Patient perretInes = new Patient(
                    "Perret",
                    "Inès",
                    'F',
                    "0698745123",
                    245021067034521l,
                    LocalDate.of(1945, 2, 10)
            );
            Patient pamamobeAdhemar = new Patient(
                    "Pamamobe",
                    "Adhémar",
                    'M',
                    "0753428619",
                    192112192020142l,
                    LocalDate.of(1992, 11, 21)
            );
            System.out.println("-----");
            vambuceHillary.afficher();
            System.out.println("-----");
            perretInes.afficher();
            System.out.println("-----");
            pamamobeAdhemar.afficher();
            System.out.println("-----");

        } catch (Exception exception) {
            System.err.println("Erreur lors de la création d'un ou plusieurs patients.");
            System.err.println(exception);
        }
    }
}
