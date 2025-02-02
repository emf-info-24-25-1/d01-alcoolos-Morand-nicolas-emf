package app;

public class Ami {

    String nom;
    int nbreBiereBuvable;

    Ami(String nom, int nbreBiereBuvable) {
        this.nom = nom;
        this.nbreBiereBuvable = nbreBiereBuvable;
    }

    public void boitUneBiere() {
        nbreBiereBuvable = nbreBiereBuvable - 1;
        System.out.println(nom + "a bu une bière.");
    }
}
