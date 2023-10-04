package atelier2;
import java.util.*;


public class Employer extends Personne {

    private int salaire;
    private final GregorianCalendar dateEmbauche;

    
    public Employer(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, int salaire,
            GregorianCalendar dateEmbauche) {
        super(leNom, lePrenom, laDate, lAdresse);
        this.salaire = salaire;
        this.dateEmbauche = dateEmbauche;
    }
    public Employer(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal,
            String ville, int salaire, GregorianCalendar dateEmbauche) {
        super(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville);
        this.salaire = salaire;
        this.dateEmbauche = dateEmbauche;
    }
    
}
