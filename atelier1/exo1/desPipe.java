// Définition du package
package atelier1.exo1;

// Déclaration de la classe 'desPipe' qui hérite de la classe 'des'
public class desPipe extends des {

    // Attribut spécifique à la classe 'desPipe'
    private final int borneMinimale;

    // Constructeur de la classe 'desPipe' prenant un nom, un nombre de faces et une borne minimale en paramètres
    public desPipe(String nom, int nbFace, int borneMinimale) {
        // Appel au constructeur de la classe 'des' avec les paramètres 'nom' et 'nbFace'
        super(nom, nbFace);

        // Vérification que la borne minimale est valide (entre 1 et le nombre de faces)
        if(borneMinimale >= 1 && borneMinimale <= nbFace) {
            this.borneMinimale = borneMinimale; // Assignation de la valeur
        } else {
            // Si la borne minimale n'est pas valide, on lève une exception
            throw new IllegalArgumentException("La borne minimale doit être entre 1 et " + nbFace);
        }
    }

    // Méthode pour obtenir la valeur de la borne minimale
    public int getBorneMinimale() {
        return borneMinimale;
    }

    // Méthode pour lancer le dé spécifique à la classe 'desPipe'
    public int lancer() {
        int resultat;

        // Boucle pour s'assurer que le résultat est supérieur à la borne minimale
        do {
            resultat = super.lancer(); // Appel à la méthode 'lancer' de la classe parente
        } while (resultat <= borneMinimale);

        return resultat;
    }
}
