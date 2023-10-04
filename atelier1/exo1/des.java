// Définition du package et des importations
package atelier1.exo1;
import java.util.*;

// Déclaration de la classe 'des'
public class des {

    // Déclaration des attributs
    private String nom; 
    private int nbFace;
    public static int deAvecNum = 0;
    public static int totalDés = 0;
    private static Random r = new Random();

    // Constructeur prenant un nom et un nombre de faces en paramètres
    public des(String nom, int nbFace) {

        totalDés ++;  // Incrémente le compteur de dés créés
        
        this.nom = nom;

        // Vérification que le nombre de faces est entre 3 et 120
        if(nbFace<121 && nbFace>2){
            this.nbFace = nbFace;
        }

        else{
            System.out.println("le nombre de face doit compris entre 3 et 120");
        }
        
    }

    // Constructeur par défaut
    public des(){
        totalDés ++;  // Incrémente le compteur de dés créés
        deAvecNum ++;  // Incrémente le compteur de dés avec numéro
        this.nom = "De n°"+ deAvecNum;  // Définit un nom par défaut
        this.nbFace = 6;  // Définit le nombre de faces par défaut à 6
    }

    // Constructeur avec seulement un nom
    public des(String nom){
        totalDés ++;  // Incrémente le compteur de dés créés
        this.nom = nom;
        this.nbFace = 6;  // Définit le nombre de faces par défaut à 6

    }

    // Constructeur avec seulement un nombre de faces
    public des( int nbFace){
        totalDés ++;  // Incrémente le compteur de dés créés
        deAvecNum ++;  // Incrémente le compteur de dés avec numéro
        this.nom = "De n°"+ deAvecNum;  // Définit un nom par défaut

        // Vérification que le nombre de faces est entre 3 et 120
        if(nbFace<121 && nbFace>2){
            this.nbFace = nbFace;
        }

        else{
            System.out.println("le nombre de face doit compris entre 3 et 120");
        }
        
    }

    // Méthode pour obtenir le nom du dé
    public String getNom(){
        return this.nom;
    }

    // Méthode pour obtenir le nombre de faces du dé
    public int getNbFace(){
        return this.nbFace;
    }

    // Méthode pour définir le nombre de faces du dé avec vérification
    public void setNbFace(int nbFace, String string) {

        if(nbFace<121 && nbFace>2){
            this.nbFace = nbFace;
        }

        else{
            System.err.println("le nombre de face doit compris entre 3 et 120");
        };


    }

    // Méthode pour lancer le dé
    public int lancer() {
        int nbAleatoire;
        do {
            nbAleatoire = r.nextInt(this.nbFace) + 1; // Modification pour éviter 0
        } while (nbAleatoire == 0);
        return nbAleatoire;
    }

    // Méthode pour obtenir le nombre total de dés créés
    public static int getTotalDesCrees() {
        return totalDés;
    };

    // Méthode pour lancer le dé plusieurs fois et obtenir le meilleur résultat
    public int lancer(int nbLances) {
        int meilleurResultat = 0;
    
        for (int i = 0; i < nbLances; i++) {
            int resultat = lancer();
            if (resultat > meilleurResultat) {
                meilleurResultat = resultat;
            }
        }
    
        return meilleurResultat;
    };

    // Méthode pour afficher les informations du dé
    public String toString() {
        return "Dé : " + this.nom + ", Nombre de faces : " + this.nbFace;
    }

    // Méthode pour comparer deux dés
    public boolean equals(Object obj){
        boolean result = false;
        if ((obj != null) && (obj instanceof des)){
            des newDe = (des) obj;
            result = ((this.nom.equals(newDe.nom)) && (this.nbFace == newDe.nbFace));
        }
        return result;
    }
}
