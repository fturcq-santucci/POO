// Définition du package
package atelier1.exo2;

// Importation des utilitaires de Java
import java.util.*;

// Déclaration de la classe 'entierFou' qui hérite de la classe 'entier'
public class entierFou extends entier {

    // Attribut spécifique à la classe 'entierFou'
    public int niveauDeFolie;
    private static Random r = new Random(); // Utilisation de la classe Random pour la génération de nombres aléatoires

    // Constructeur de la classe 'entierFou' prenant les bornes, une valeur et un niveau de folie en paramètres
    public entierFou(int borne1, int borne2, int valeur, int niveauDeFolie) {
        // Appel au constructeur de la classe 'entier' avec les bornes et la valeur
        super(borne1, borne2, valeur);
        this.niveauDeFolie = niveauDeFolie; // Assignation du niveau de folie
    }

    // Constructeur de la classe 'entierFou' prenant les bornes et un niveau de folie en paramètres
    public entierFou(int borne1, int borne2, int niveauDeFolie) {
        // Appel au constructeur de la classe 'entier' avec les bornes
        super(borne1, borne2);
        this.niveauDeFolie = niveauDeFolie; // Assignation du niveau de folie
    }

    // Méthode pour obtenir le niveau de folie
    public int getNiveauDeFolie() {
        return niveauDeFolie;
    }

    // Méthode pour augmenter la valeur avec un niveau de folie
    public void incremente() {
        // Appel à la méthode 'incremente' de la classe parente en ajoutant une valeur aléatoire entre 0 et le niveau de folie
        super.incremente(r.nextInt(this.niveauDeFolie));
    }
}
