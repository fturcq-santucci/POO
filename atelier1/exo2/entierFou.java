package atelier1.exo2;
import java.util.*;

public class entierFou extends entier{

    public int niveauDeFolie;
    private static Random r = new Random();

    public entierFou(int borne1, int borne2, int valeur, int niveauDeFolie) {
        super(borne1, borne2, valeur);
        this.niveauDeFolie = niveauDeFolie;
    }

    public entierFou(int borne1, int borne2, int niveauDeFolie) {
        super(borne1, borne2);
        this.niveauDeFolie = niveauDeFolie;
    }

    public int getNiveauDeFolie() {
        return niveauDeFolie;
    }

    public void incremente(){

        super.incremente(r.nextInt(this.niveauDeFolie));
    }

   
    
}
