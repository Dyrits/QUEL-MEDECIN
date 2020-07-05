package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient extends Personne {
    private String commentaires;
    private char sexe;
    private long numeroSecuriteSociale;
    private LocalDate dateDeNaissance;

    /**
     * Constructeur comportant l'ensemble des champs.
     * L'appel au constructeur sans renseigner le champs commentaire initialise celui-ci à "[Aucun commentaire]".
     *
     * @param nom String | Nom du patient.
     * @param prenom String | Prénom du patient.
     * @param sexe char | Sexe du patient (M/F).
     * @param telephone String | Numéro de téléphone.
     * @param numeroSecuriteSociale long | Numéro de sécurité sociale de 13 chiffres avec clé de deux chiffres.
     * @param dateDeNaissance LocalDate | Date de naissance du patient formaté via LocalDate.
     * @param commentaires String | Commentaires éventuelles.
     * @param adresse Adresse | Adresse du patient.
     * @throws Exception Le sexe doit être F ou M, et le numéro de sécurité sociale doit comporter un total de 15 chiffres.
     */
    public Patient(String nom, String prenom, char sexe, String telephone, long numeroSecuriteSociale, LocalDate dateDeNaissance, String commentaires, Adresse adresse) throws Exception {
        super(nom, prenom, telephone, adresse);
        setSexe(sexe);
        setNumeroSecuriteSociale(numeroSecuriteSociale);
        setDateDeNaissance(dateDeNaissance);
        setCommentaires(commentaires);
    }

    public Patient(String nom, String prenom, char sexe, String telephone, long numeroSecuriteSociale, LocalDate dateDeNaissance, Adresse adresse) throws Exception {
        this(nom, prenom, sexe, telephone, numeroSecuriteSociale, dateDeNaissance, "[Aucun commentaire]", adresse);
    }


    /**
     * Affiche l'ensemble des informations pour un patient.
     */
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Sexe : " + getSexe());
        System.out.println("Numéro de sécurité sociale : " + getNumeroSecuriteSociale());
        System.out.println("Date de naissance : " + getDateDeNaissance().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("Commentaires : " + getCommentaires());
        this.adresse.afficher();
    }


    // GETTERS AND SETTERS

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
}
