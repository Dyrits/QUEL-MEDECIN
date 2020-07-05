package fr.eni.ecole.quelMedecin.bo;

public class MedecinSpecialiste extends Medecin {
    private int tarif;
    private String specialite;

    /**
     * Appel du constructeur parent.
     *
     * @param nom String | Nom du médecin.
     * @param prenom String | Prénom du médecin.
     * @param telephone String | Téléphone du médecin.
     * @param adresse Adresse [ Adresse du médecin.
     */
    public MedecinSpecialiste(String nom, String prenom, String telephone, Adresse adresse, String specialite, int tarif) {
        super(nom, prenom, telephone, adresse);
        setSpecialite(specialite);
        setTarif(tarif);
    }

    /**
     * Affiche l'ensemble des informations pour un médecin.
     */
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Spécialité : " + getSpecialite());
        System.out.println("Tarif : " + getTarif() + "€");
        System.out.println("Adresse : ");
        getAdresse().afficher();
        this.afficherCréneaux();
    }


    // GETTERS AND SETTERS

    public int getTarif() { return this.tarif; }

    public void setTarif(int tarif) { this.tarif = tarif; }

    public String getSpecialite() { return this.specialite; }

    public void setSpecialite(String specialite) { this.specialite = specialite; }
}
