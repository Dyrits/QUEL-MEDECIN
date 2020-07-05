package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient {
    private String nom, prenom, telephone, commentaires;
    private char sexe;
    private long numeroSecuriteSociale;
    private LocalDate dateDeNaissance;
    private Adresse adresse;

    /**
     * Constructeur comportant l'ensemble des champs.
     * L'appel au constructeur sans renseigner le champs commentaire initialise celui-ci à "[Aucun commentaire]".
     *
     * @param nom Nom du patient.
     * @param prenom Prénom du patient.
     * @param sexe Sexe du patient (M/F).
     * @param telephone Numéro de téléphone.
     * @param numeroSecuriteSociale Numéro de sécurité sociale de 13 chiffres avec clé de deux chiffres.
     * @param dateDeNaissance Date de naissance formaté via LocalDate.
     * @param commentaires Commentaires éventuelles.
     * @param adresse Instance de la classe adresse correspondant à l'adresse du patient.
     * @throws Exception Le sexe doit être F ou M, et le numéro de sécurité sociale doit comporter un total de 15 chiffres.
     */
    public Patient(String nom, String prenom, char sexe, String telephone, long numeroSecuriteSociale, LocalDate dateDeNaissance, String commentaires, Adresse adresse) throws Exception {
        setNom(nom);
        setPrenom(prenom);
        setSexe(sexe);
        setTelephone(telephone);
        setNumeroSecuriteSociale(numeroSecuriteSociale);
        setDateDeNaissance(dateDeNaissance);
        setCommentaires(commentaires);
        setAdresse(adresse);
    }

    public Patient(String nom, String prenom, char sexe, String telephone, long numeroSecuriteSociale, LocalDate dateDeNaissance, Adresse adresse) throws Exception {
        this(nom, prenom, sexe, telephone, numeroSecuriteSociale, dateDeNaissance, "[Aucun commentaire]", adresse);
    }


    /**
     * Affiche l'ensemble des informations pour un patient.
     */
    public void afficher() {
        System.out.println(getNom() + " " + getPrenom());
        System.out.println("Téléphone : " + getTelephone());
        System.out.println("Sexe : " + getSexe());
        System.out.println("Numéro de sécurité sociale : " + getNumeroSecuriteSociale());
        System.out.println("Date de naissance : " + getDateDeNaissance().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Commentaires : " + getCommentaires());
        this.adresse.afficher();
    }


    // GETTERS AND SETTERS

    public String getNom() { return this.nom; }

    public void setNom(String nom) { this.nom = nom.toUpperCase(); }

    public String getPrenom() { return this.prenom; }

    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getTelephone() { return this.telephone; }

    public void setTelephone(String telephone) { this.telephone = telephone; }

    public String getCommentaires() { return this.commentaires; }

    public void setCommentaires(String commentaires) { this.commentaires = commentaires; }

    public String getSexe() { return this.sexe == 'M' ? "Masculin" : "Féminin"; }

    public void setSexe(char sexe) throws Exception {
        if(sexe == 'M' || sexe == 'F') {
            this.sexe = sexe;
        } else throw new Exception("Le sexe d'un patient doit être M (Masculin) ou F (Féminin) !");
    }

    public long getNumeroSecuriteSociale() { return this.numeroSecuriteSociale; }
    public void setNumeroSecuriteSociale(long numeroSecuriteSociale) throws Exception {
        if (String.valueOf(numeroSecuriteSociale).length() == 15) {
            this.numeroSecuriteSociale = numeroSecuriteSociale;
        } else throw new Exception("Le numéro de sécurité sociale doit comporter 15 chiffres.");

    }

    public LocalDate getDateDeNaissance() { return this.dateDeNaissance; }
    public void setDateDeNaissance(LocalDate dateDeNaissance) { this.dateDeNaissance = dateDeNaissance; }

    public void setAdresse(Adresse adresse) { this.adresse = adresse; }
}
