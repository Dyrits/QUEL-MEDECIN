package fr.eni.ecole.quelMedecin.bo;

public class Adresse {
    private String mentionsComplementaires, complementNumero, voie, ville;
    private int numero, codePostal;

    /**
     * Constructeur comprenant les champs principaux.
     *
     * @param numero Numéro de la voie.
     * @param voie Nom de la voie.
     * @param codePostal Code postal.
     * @param ville Ville.
     */
    public Adresse(int numero, String voie, int codePostal, String ville) {
        setNumero(numero);
        setVoie(voie);
        setCodePostal(codePostal);
        setVille(ville);
    }

    // Constructeurs avec champs optionnels:

    public Adresse(String mentionsComplementaires, int numero, String voie, int codePostal, String ville) {
        this(numero, voie, codePostal, ville);
        setMentionsComplementaires(mentionsComplementaires);
    }

    public Adresse(int numero, String complementNumero, String voie, int codePostal, String ville) {
        this(numero, voie, codePostal, ville);
        setComplementNumero(complementNumero);
    }

    /**
     * Constructeur comprenant l'ensemble des champs.
     *
     * @param mentionsComplementaires Mentions complémentaires.
     * @param numero Numéro de la voie.
     * @param complementNumero Complément du numéro de la voie.
     * @param voie  Nom de la voie.
     * @param codePostal Code postal.
     * @param ville Ville.
     */
    public Adresse(String mentionsComplementaires, int numero, String complementNumero, String voie, int codePostal, String ville) {
        this(numero, voie, codePostal, ville);
        setMentionsComplementaires(mentionsComplementaires);
        setComplementNumero(complementNumero);
    }

    /**
     * Affiche une adresse.
     */
    public void afficher() {
        if (getMentionsComplementaires() != null) { System.out.println(getMentionsComplementaires()); }
        System.out.print(getNumero());
        if (getComplementNumero() != null) { System.out.print(getComplementNumero()); }
        System.out.print(" " + getVoie());
        System.out.println();
        // Ajout des éventuels zéros devant le code postal:
        for (int zeros = 0; zeros < 5 - String.valueOf(getCodePostal()).length(); zeros ++) { System.out.print("0"); }
        System.out.print(getCodePostal() + " " + getVille());
        System.out.println();
    }


    // GETTERS AND SETTERS

    public String getMentionsComplementaires() { return this.mentionsComplementaires; }

    public void setMentionsComplementaires(String mentionsComplementaires) { this.mentionsComplementaires = mentionsComplementaires; }

    public String getComplementNumero() { return this.complementNumero; }

    public void setComplementNumero(String complementNumero) { this.complementNumero = complementNumero; }

    public String getVoie() { return this.voie; }

    public void setVoie(String voie) { this.voie = voie; }

    public String getVille() { return this.ville; }

    public void setVille(String ville) { this.ville = ville.toUpperCase(); }

    public int getNumero() { return this.numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public int getCodePostal() { return this.codePostal; }

    public void setCodePostal(int codePostal){ this.codePostal = codePostal; }
}


