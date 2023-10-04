package atelier1.exo1;

public class test {

    public static void main(String[] args){
        des sansParametre = new des();
        des leDeAvecUnNom = new des("leDeAvecUnNom");
        des leDeAvecFace = new des(3);
        des leDeAvecUnNomEtUnNum = new des("leDeAvecUnNomEtUnNum", 15);



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

        System.out.println("nombre de des " + des.getTotalDesCrees());


        System.out.println("--------------------------------------------------------");


        System.out.println("le meilleur resultat est " + leDeAvecUnNomEtUnNum.lancer(5));

        System.out.println("--------------------------------------------------------");

        System.out.println(leDeAvecUnNom.toString());

        System.out.println("--------------------------------------------------------");

        desPipe dePipe = new desPipe("Dé Pipé", 6, 4);

        System.out.println(dePipe.toString());
        System.out.println(dePipe.lancer());


        System.out.println("--------------------------------------------------------");


        desMemoire deMemoire = new desMemoire("DeMemoire", 6);
        System.out.println(deMemoire.toString());
       
        
         for (int i = 0; i < 15; i++) {
            int resultat = deMemoire.lancer();
             System.out.println("Résultat du lancer : " + resultat);
                }


         System.out.println("--------------------------------------------------------");

            
        
        


    }
    
}
