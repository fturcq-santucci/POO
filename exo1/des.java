package atelier1.exo1;
import java.util.*;

public class des {

    private String nom; 
    private int nbFace;
    public static int deAvecNum = 0;
    public static int totalDés = 0;
    private static Random r = new Random();

    public des(String nom, int nbFace) {

        totalDés ++;
        
        this.nom = nom;

         if(nbFace<121 && nbFace>2){
            this.nbFace = nbFace;
        }

        else{
            System.out.println("le nombre de face doit compris entre 3 et 120");
        }
        
    }

    public des(){
        totalDés ++;
        deAvecNum ++;
        this.nom = "De n°"+ deAvecNum;
        this.nbFace = 6;
    }

    public des(String nom){
        totalDés ++;
        this.nom = nom;
        this.nbFace = 6;

    }

    public des( int nbFace){
        totalDés ++;
        deAvecNum ++;
        this.nom = "De n°"+ deAvecNum;

        if(nbFace<121 && nbFace>2){
            this.nbFace = nbFace;
        }

        else{
            System.out.println("le nombre de face doit compris entre 3 et 120");
        }
        
    }

    public String getNom(){
        return this.nom;
    }

    public int getNbFace(){
        return this.nbFace;
    }

    public void setNbFace(int nbFace, String string) {

        if(nbFace<121 && nbFace>2){
            this.nbFace = nbFace;
        }

        else{
            System.err.println("le nombre de face doit compris entre 3 et 120");
        };


    }

    public int lancer() {
        int nbAleatoire;
        do {
            nbAleatoire = r.nextInt(this.nbFace + 1);
        } while (nbAleatoire == 0);
        return nbAleatoire;
    }

    public static int getTotalDesCrees() {
        return totalDés;
    };

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

    public String toString() {
        return "Dé : " + this.nom + ", Nombre de faces : " + this.nbFace;
    }
    
    


    
    
}
