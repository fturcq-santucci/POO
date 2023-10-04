package atelier1.exo1;

public class desMemoire extends des {

    private int dernierResultat;

    public desMemoire(String nom, int nbFace) {
        super(nom, nbFace);
        dernierResultat = -1; // Initialisation à une valeur qui ne peut pas être obtenue avec le lancer
    }

    
    public int lancer() {
        int resultat;

        do {
            resultat = super.lancer();
        } while (resultat == dernierResultat);

        dernierResultat = resultat;
        return resultat;
    }
}
