package atelier1.exo1;

public class desPipe extends des {

    private final int borneMinimale;

    public desPipe(String nom, int nbFace, int borneMinimale) {
        super(nom, nbFace);
        
        if(borneMinimale >= 1 && borneMinimale <= nbFace) {
            this.borneMinimale = borneMinimale;
        } else {
            throw new IllegalArgumentException("La borne minimale doit être entre 1 et " + nbFace);
        }
    }

    public int getBorneMinimale() {
        return borneMinimale;
    }

    public int lancer() {
        int resultat;

        do {
            resultat = super.lancer();
        } while (resultat <= borneMinimale);

        return resultat;
    }
}
