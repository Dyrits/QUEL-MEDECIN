package fr.eni.ecole.quelMedecin.bo;

public class MedecinGeneraliste {
    private String nom, prenom, telephone;
    private static int tarif = 25;
    private Adresse adresse;
    private Creneau[] creneaux = new Creneau[15];

    /**
     * Constructeur.
     *
     * @param nom Nom du médecin.
     * @param prenom Prénom du médecin.
     * @param telephone Numéro de téléphone du médecin.
     * @param adresse Instance de la classe adresse correspondant à l'adresse du médecin.
     */
    public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
        setNom(nom);
        setPrenom(prenom);
        setTelephone(telephone);
        setAdresse(adresse);
    }

    /**
     * Affiche l'ensemble des informations pour un médecin.
     */
    public void afficher() {
        System.out.println(getNom() + " " + getPrenom());
        System.out.println("Téléphone : " + getTelephone());
        System.out.println("Tarif : " + getTafif() + "€");
        System.out.println("Adresse : ");
        getAdresse().afficher();
        if (getCreneaux()[0] == null ) { return; }
        System.out.println("Créneaux : ");
        for (Creneau creneau : getCreneaux()) {
            if (creneau == null) { break; }
            creneau.afficher();
        }
    }

    /**
     * Permet d'ajouter un créneau entré en paramètre à un médecin.
     *
     * @param creneau Créneau à ajouter.
     */
    void ajouterCreneau(Creneau creneau) {
        int index = 0;
        while (index < getCreneaux().length && getCreneaux()[index] != null) { index ++; }
        if (index == getCreneaux().length) { System.err.println("Le médecin dispose déjà de trop nombreux créneaux."); }
        else { getCreneaux()[index] = creneau; }

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

    public Adresse getAdresse() {return this.adresse; }

    public void setAdresse(Adresse adresse) { this.adresse = adresse; }

    public static int getTafif() { return tarif; }

    public static void setTarif(int tarif) { MedecinGeneraliste.tarif = tarif; }

    public Creneau[] getCreneaux() { return this.creneaux; }
}
