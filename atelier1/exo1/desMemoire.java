// Définition du package
package atelier1.exo1;

// Déclaration de la classe 'desMemoire' qui hérite de la classe 'des'
public class DesMemoire extends Des {

    // Attribut spécifique à la classe 'desMemoire'
    private int dernierResultat;

    // Constructeur de la classe 'desMemoire' prenant un nom et un nombre de faces en paramètres
    public DesMemoire(String nom, int nbFace) {
        // Appel au constructeur de la classe 'des' avec les paramètres 'nom' et 'nbFace'
        super(nom, nbFace);
        
        // Initialisation de l'attribut 'dernierResultat' à une valeur qui ne peut pas être obtenue avec le lancer
        dernierResultat = -1;
    }

    // Méthode pour lancer le dé spécifique à la classe 'desMemoire'
    public int lancer() {
        int resultat;

        // Boucle pour s'assurer que le résultat est différent du dernier résultat obtenu
        do {
            resultat = super.lancer(); // Appel à la méthode 'lancer' de la classe parente
        } while (resultat == dernierResultat);

        dernierResultat = resultat; // Mise à jour du dernier résultat
        return resultat;
    }
}
