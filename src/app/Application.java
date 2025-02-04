package app;

import models.Ami; //Faut importer de l'autre package

public class Application {

    public static void main(String[] args) {
        //Déclaration et affectation des amis (comme des tableaux)

        Ami ami1 = new Ami("Bob", 3);

        Ami ami2 = new Ami("Francis", 8);

        ami2.setNbreBiereBuvable(6);

        ami1.boitUneBiere();
        ami1.boitUneBiere();
        ami1.boitUneBiere();
        ami1.boitUneBiere();

        ami2.boitUneBiere();
        ami2.boitUneBiere();

        System.out.println("Le nombre supportable de bières pour " + ami1.getNom() + " est de " + ami1.getNbreBiereBuvable());
        System.out.println("Le nombre supportable de bières pour " + ami2.getNom() + " est de " + ami2.getNbreBiereBuvable());
    }
}
