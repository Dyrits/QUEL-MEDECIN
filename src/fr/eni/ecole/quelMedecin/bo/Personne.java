package fr.eni.ecole.quelMedecin.bo;

public class Personne {
    private String nom, prenom, telephone;
    private Adresse adresse;

    /**
     * Constructeur de la classe mère "Personne".
     *
     * @param nom String | Nom de la personne.
     * @param prenom String | Prénom de la personne.
     * @param telephone String | Téléphone de la personne.
     * @param adresse Adresse [ Adresse de la personne.
     */
    public Personne(String nom, String prenom, String telephone, Adresse adresse) {
        setNom(nom);
        setPrenom(prenom);
        setTelephone(telephone);
        setAdresse(adresse);
    }

    public void afficher() {
        System.out.println(getNom() + " " + getPrenom());
        System.out.println("Téléphone : " + getTelephone());
    }

    // GETTERS AND SETTERS

    public String getNom() { return this.nom; }

    public void setNom(String nom) { this.nom = nom.toUpperCase(); }

    public String getPrenom() { return this.prenom; }

    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getTelephone() { return this.telephone; }

    public void setTelephone(String telephone) { this.telephone = telephone; }

    public Adresse getAdresse() {return this.adresse; }

    public void setAdresse(Adresse adresse) { this.adresse = adresse; }

}
