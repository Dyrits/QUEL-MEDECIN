package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class RendezVous {
    Creneau creneau;
    Patient patient;
    LocalDate date;

    /**
     * Constructeur.
     *
     * @param creneau Créneau du rendez-vous.
     * @param patient Patient concerné.
     * @param date Date du rendez-vous.
     */
    public RendezVous (Creneau creneau, Patient patient, LocalDate date) {
        setCreneau(creneau);
        setPatient(patient);
        setDate(date);
    }

    /**
     * Affiche les détails d'un rendez-vous.
     */
    public void afficher() {
        System.out.print("Rendez vous du " + getDate().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        getCreneau().afficher();
        System.out.println("avec le Dr. " + getCreneau().getMedecin().getNom());
        getPatient().afficher();
    }


    public Creneau getCreneau() { return this.creneau; }

    public void setCreneau(Creneau creneau) { this.creneau = creneau; }

    public Patient getPatient() { return this.patient; }

    public void setPatient(Patient patient) { this.patient = patient; }

    public LocalDate getDate() { return this.date; }

    public void setDate(LocalDate date) { this.date = date; }
}
