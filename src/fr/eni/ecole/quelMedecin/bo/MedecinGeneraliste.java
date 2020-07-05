package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste extends  Medecin {
    private static int tarif = 25;

    /**
     * Appel du constructeur parent.
     *
     * @param nom String | Nom du médecin.
     * @param prenom String | Prénom du médecin.
     * @param telephone String | Téléphone du médecin.
     * @param adresse Adresse [ Adresse du médecin.
     */
    public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
        super(nom, prenom, telephone, adresse);
    }

    /**
     * Affiche l'ensemble des informations pour un médecin.
     */
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Tarif : " + getTarif() + "€");
        System.out.println("Adresse : ");
        getAdresse().afficher();
        this.afficherCréneaux();
    }


    // GETTERS AND SETTERS

    public static int getTarif() { return tarif; }

    public static void setTarif(int tarif) { MedecinGeneraliste.tarif = tarif; }
}
