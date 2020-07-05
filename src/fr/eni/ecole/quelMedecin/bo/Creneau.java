package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Creneau {
    LocalTime heureDebut;
    int duree;
    Medecin medecin;

    /**
     * Constructeur.
     *
     * @param heureDebut LocalTime |  Heure de début du créneau.
     * @param duree int | Durée, en minutes, du créneau.
     * @param medecin Medecin | Médecin associé au créneau.
     */
    public Creneau(LocalTime heureDebut, int duree, Medecin medecin) {
        setHeureDebut(heureDebut);
        setDuree(duree);
        setMedecin(medecin);
        medecin.ajouterCreneau(this);
    }

    /**
     * Affiche l'heure de début, fin, et durée d'un créneau.
     */
    public void afficher() {
        System.out.println(
                getHeureDebut().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)) + " - " +
                getHeureDebut().plusMinutes(getDuree()).format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)) +
                " (" + getDuree() + " minutes)"
        );

    }


    // GETTERS AND SETTERS

    public LocalTime getHeureDebut() { return heureDebut; }

    public void setHeureDebut(LocalTime heureDebut) { this.heureDebut = heureDebut; }

    public int getDuree() { return duree; }

    public void setDuree(int duree) { this.duree = duree; }

    public Medecin getMedecin() { return medecin; }

    public void setMedecin(Medecin medecin) { this.medecin = medecin; }
}
