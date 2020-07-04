package fr.eni.ecole.quelMedecin.test;

import fr.eni.ecole.quelMedecin.bo.Adresse;

public class TestAdresse {
    public static void main(String[] args) {
        Adresse zacMN = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain");
        Adresse avenueLL = new Adresse(19, "avenue Léo Lagrange", 79000, "Niort");
        Adresse rueG = new Adresse(4, "Rue des Glatiniers", 2100, "Saint-Quentin");
        System.out.println("-----");
        zacMN.afficher();
        System.out.println("-----");
        avenueLL.afficher();
        System.out.println("-----");
        rueG.afficher();
    }
}
