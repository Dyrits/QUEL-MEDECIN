package fr.eni.ecole.quelMedecin.bo;

public abstract class Medecin extends Personne {
    protected Creneau[] creneaux = new Creneau[15];

    /**
     * Appel du constructeur parent.
     *
     * @param nom String | Nom du médecin.
     * @param prenom String | Prénom du médecin.
     * @param telephone String | Téléphone du médecin.
     * @param adresse Adresse [ Adresse du médecin.
     */
    public Medecin(String nom, String prenom, String telephone, Adresse adresse) {
        super(nom, prenom, telephone, adresse);
    }

    /**
     * Affiche l'ensemble des informations d'un médecin.
     */
    @Override
    public void afficher() {
        super.afficher();
        afficherSpecificites();
        getAdresse().afficher();
        System.out.println("Adresse : ");
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
     * @param creneau Creneau | Créneau à ajouter.
     */
    public void ajouterCreneau(Creneau creneau) {
        int index = 0;
        while (index < getCreneaux().length && getCreneaux()[index] != null) { index ++; }
        if (index == getCreneaux().length) { System.err.println("Le médecin dispose déjà de trop nombreux créneaux."); }
        else { getCreneaux()[index] = creneau; }

    }


    // ABSTRACT METHODS

    /**
     * Affiche les spécificités propre à une classe enfant.
     */
    protected abstract void afficherSpecificites();


    // GETTERS AND SETTERS

    public Creneau[] getCreneaux() { return this.creneaux; }
}
