package app;

public class Application {

    public static void main(String[] args) {
        Ami ami1;
        ami1 = new Ami("Bernard", 8);
        System.out.println(ami1.nom + " peut encore boire " + ami1.nbreBiereBuvable + " bières.");

        Ami ami2;
        ami2 = new Ami("Jean", 4);
        System.out.println(ami2.nom + " peut encore boire " + ami2.nbreBiereBuvable + " bières.");


        Ami ami3;
        ami3 = new Ami("Steve", 6);
        System.out.println(ami3.nom + " peut encore boire " + ami3.nbreBiereBuvable + " bières.");

        ami1.boitUneBiere();
        ami2.boitUneBiere();
        ami3.boitUneBiere();

        System.out.println(ami1.nom + " peut encore boire " + ami1.nbreBiereBuvable + " bières.");
        System.out.println(ami2.nom + " peut encore boire " + ami2.nbreBiereBuvable + " bières.");
        System.out.println(ami3.nom + " peut encore boire " + ami3.nbreBiereBuvable + " bières.");


    }
}
