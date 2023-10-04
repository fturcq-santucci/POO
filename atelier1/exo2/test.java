package atelier1.exo2;

public class Test {

    public static void main(String[] args){

        Entier nombreNonDefini = new Entier(0, 10);
        Entier nombreDefini = new Entier(5, 2, 6);
        EntierFou entierFou1 = new EntierFou(5, 100, 8);


        System.out.println("borne 1 = " + nombreDefini.getBorne1());
        

        System.out.println("--------------------------------------------------------");

        nombreDefini.incremente(4);
        System.out.println("valeur nombreDef = " + nombreDefini.getValeur());

        System.out.println("--------------------------------------------------------");

        System.out.println(nombreDefini.toString());

        System.out.println("--------------------------------------------------------");

        entierFou1.incremente();

        System.out.println(entierFou1.getValeur());
        System.out.println(entierFou1.getBorne2());
        System.out.println(entierFou1.getBorne1());


        System.out.println("--------------------------------------------------------");

        entierFou1.incremente();

        System.out.println(entierFou1.getValeur());
        System.out.println(entierFou1.getBorne2());
        System.out.println(entierFou1.getBorne1());

        System.out.println("--------------------------------------------------------");

        entierFou1.incremente();

        System.out.println(entierFou1.getValeur());
        System.out.println(entierFou1.getBorne2());
        System.out.println(entierFou1.getBorne1());

    }

    
}
