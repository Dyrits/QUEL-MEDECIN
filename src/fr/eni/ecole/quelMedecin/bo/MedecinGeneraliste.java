package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste {
    private String nom, prenom, telephone;
    private static int tarif = 25;

    /**
     * Constructeur.
     *
     * @param nom Nom du médecin.
     * @param prenom Prénom du médecin.
     * @param telephone Numéro de téléphone du médecin.
     */
    public MedecinGeneraliste(String nom, String prenom, String telephone) {
        setNom(nom);
        setPrenom(prenom);
        setTelephone(telephone);
    }

    /**
     * Affiche l'ensemble des informations pour un médecin.
     */
    public void afficher() {
        System.out.println(getNom() + " " + getPrenom());
        System.out.println("Téléphone : " + getTelephone());
        System.out.println("Tarif : " + getTafif() + "€");
    }

    // GETTERS AND SETTERS

    public String getNom() { return this.nom; }

    public void setNom(String nom) { this.nom = nom.toUpperCase(); }

    public String getPrenom() { return this.prenom; }

    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getTelephone() { return this.telephone; }

    public void setTelephone(String telephone) {
        System.out.println("Nouveau numéro du Dr " + getNom() + " : " + telephone);
        this.telephone = telephone;
    }

    public static int getTafif() { return tarif; }

    public static void setTarif(int tarif) { MedecinGeneraliste.tarif = tarif; }
}
