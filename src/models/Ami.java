package models;

public class Ami {

    // Attributs
    private String nom;
    private int nbreBiereBuvable; // Mettre tjr private pour les attributs

    // Constructeur
    public Ami(String nom, int nbreBiereBuvable) {
        this.nom = nom;
        this.nbreBiereBuvable = nbreBiereBuvable;
    }

    // Méthodes publiques
    public void boitUneBiere() { // Pas besoin de retour car son but est d'afficher (faire un sout)'
        if (nbreBiereBuvable > 0) {
            nbreBiereBuvable--;
            System.out.println(nom + " boit une bière.");
        } else {
            System.out.println(nom + " ne peut plus boire de bières.");
        }
    }

    // Getters & Setters tjr en public
    public final String getNom() {
        return nom;
    }

    public int getNbreBiereBuvable() {
        return nbreBiereBuvable;
    }

    public void setNbreBiereBuvable(int nbreBiereBuvable) {
        this.nbreBiereBuvable = nbreBiereBuvable; // Le this. permet de ressortir de la méthode pour le contexte qui est
                                                  // plus haut
    }

}
