package atelier1.exo2;

import atelier1.exo1.des;

public class entier{

    private int valeur;
    private int borne1;
    private int borne2;

    
    

    public entier(int borne1, int borne2 ,int valeur) {
        
        if(borne1 > borne2){

            this.borne1 = borne2;
            this.borne2 = borne1;

        }
        else{
            this.borne1 = borne1;
            this.borne2 = borne2;
        }
        if( valeur<borne2 && valeur > borne1){
            this.valeur = valeur;
        }

        else {

            this.valeur = 0;

        }
    }

    public entier(int borne1, int borne2) {
        
        if(borne1 > borne2){
            this.borne1 = borne2;
            this.borne2 = borne1;

        }
        else{
            this.borne1 = borne1;
            this.borne2 = borne2;
        }
        
        this.valeur = 0;
    }


    public int getBorne1() {
        return borne1;
    }

    public int getBorne2() {
        return borne2;
    }


    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        
        if (this.borne1 < valeur && valeur < this.borne2){

            this.valeur = valeur;

        } else{
            this.valeur = 0;
        };
        
    }

    public void incremente(){

        if (this.valeur + 1 < this.borne2){
            this.valeur += 1;
        }
        else{
            System.err.println("la valeur n'est pas comprise entre les borne ");
        
        }
    }

    public void incremente(int n){

        if (this.valeur + n < this.borne2){
            
            this.valeur += n;

        }
        else{

            System.err.println("la valeur n'est pas comprise entre les borne ");
        
        };

       

    }

    public String toString(){

        return "valeur : " + this.valeur + ", borneMin : " + this.borne1 + ", borne Max : " + this.borne2; 

    };

    public boolean equals(Object obj){

        entier newEntier = (entier) obj;
        return this.valeur == newEntier.valeur && this.borne1 == newEntier.borne1 && this.borne2 == newEntier.borne2;
        
    }

    

    
    
}