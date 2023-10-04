package atelier1.exo1;

public class Test {

    public static void main(String[] args){
        Des sansParametre = new Des();
        Des leDeAvecUnNom = new Des("leDeAvecUnNom");
        Des leDeAvecFace = new Des(3);
        Des leDeAvecUnNomEtUnNum = new Des("leDeAvecUnNomEtUnNum", 15);



        System.out.print("debut");

        System.out.println("--------------------------------------------------------");
        System.out.println(sansParametre.getNom());
        System.out.println(sansParametre.getNbFace());

        System.out.println("--------------------------------------------------------");
        
        System.out.println(leDeAvecUnNom.getNom());
        System.out.println(leDeAvecUnNom.getNbFace());
        
        System.out.println("--------------------------------------------------------");

        System.out.println(leDeAvecFace.getNom());
        System.out.println(leDeAvecFace.getNbFace());
        System.out.println("le rsultat du lance est = " + leDeAvecFace.lancer());

        System.out.println("--------------------------------------------------------");

        System.out.println("nombre de Des " + Des.getTotalDesCrees());


        System.out.println("--------------------------------------------------------");


        System.out.println("le meilleur resultat est " + leDeAvecUnNomEtUnNum.lancer(5));

        System.out.println("--------------------------------------------------------");

        System.out.println(leDeAvecUnNom.toString());

        System.out.println("--------------------------------------------------------");

        DesPipe dePipe = new DesPipe("Dé Pipé", 6, 4);

        System.out.println(dePipe.toString());
        System.out.println(dePipe.lancer());


        System.out.println("--------------------------------------------------------");


        DesMemoire deMemoire = new DesMemoire("DeMemoire", 6);
        System.out.println(deMemoire.toString());
       
        
         for (int i = 0; i < 15; i++) {
            int resultat = deMemoire.lancer();
             System.out.println("Résultat du lancer : " + resultat);
                }


         System.out.println("--------------------------------------------------------");

            
        
        


    }
    
}
