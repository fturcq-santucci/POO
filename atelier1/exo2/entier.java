// Définition du package
package atelier1.exo2;



// Déclaration de la classe 'entier'
public class Entier {

    // Déclaration des attributs
    private int valeur;
    private int borne1;
    private int borne2;

    // Constructeur prenant deux bornes et une valeur en paramètres
    public Entier(int borne1, int borne2, int valeur) {
        // Vérification et attribution des bornes dans l'ordre croissant
        if (borne1 > borne2) {
            this.borne1 = borne2;
            this.borne2 = borne1;
        } else {
            this.borne1 = borne1;
            this.borne2 = borne2;
        }
        // Vérification que la valeur est comprise entre les bornes
        if (valeur < borne2 && valeur > borne1) {
            this.valeur = valeur;
        } else {
            this.valeur = 0;
        }
    }

    // Constructeur prenant deux bornes en paramètres
    public Entier(int borne1, int borne2) {
        // Vérification et attribution des bornes dans l'ordre croissant
        if (borne1 > borne2) {
            this.borne1 = borne2;
            this.borne2 = borne1;
        } else {
            this.borne1 = borne1;
            this.borne2 = borne2;
        }
        this.valeur = 0; // Initialisation de la valeur à zéro
    }

    // Méthode pour obtenir la première borne
    public int getBorne1() {
        return borne1;
    }

    // Méthode pour obtenir la deuxième borne
    public int getBorne2() {
        return borne2;
    }

    // Méthode pour obtenir la valeur
    public int getValeur() {
        return valeur;
    }

    // Méthode pour définir la valeur avec vérification des bornes
    public void setValeur(int valeur) {
        if (this.borne1 < valeur && valeur < this.borne2) {
            this.valeur = valeur;
        } else {
            this.valeur = 0;
        }
    }

    // Méthode pour augmenter la valeur de 1, avec vérification des bornes
    public void incremente() {
        if (this.valeur + 1 < this.borne2) {
            this.valeur += 1;
        } else {
            System.err.println("La valeur n'est pas comprise entre les bornes");
        }
    }

    // Méthode pour augmenter la valeur de n, avec vérification des bornes
    public void incremente(int n) {
        if (this.valeur + n < this.borne2) {
            this.valeur += n;
        } else {
            System.err.println("La valeur n'est pas comprise entre les bornes");
        }
    }

    // Méthode pour afficher les informations de l'entier
    public String toString() {
        return "Valeur : " + this.valeur + ", Borne Min : " + this.borne1 + ", Borne Max : " + this.borne2;
    }

    // Méthode pour comparer deux entiers
    public boolean equals(Object obj) {
        Entier newEntier = (Entier) obj;
        return this.valeur == newEntier.valeur && this.borne1 == newEntier.borne1 && this.borne2 == newEntier.borne2;
    }

}
